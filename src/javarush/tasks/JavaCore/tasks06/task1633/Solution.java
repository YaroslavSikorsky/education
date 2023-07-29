package javarush.tasks.JavaCore.tasks06.task1633;

/* 
Отдебажим все на свете
*/

public class Solution {
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {
        TestedThread commonThread = new TestedThread(handler);
        //Thread.setDefaultUncaughtExceptionHandler(handler);

        Thread threadA = new Thread(commonThread, "Нить 1");
        Thread threadB = new Thread(commonThread, "Нить 2");
        
        threadA.setDefaultUncaughtExceptionHandler(handler);
        threadB.setDefaultUncaughtExceptionHandler(handler);
        
        threadA.start();
        threadB.start();

        threadA.interrupt();
        threadB.interrupt();
    }

    public static class TestedThread extends Thread {
        public TestedThread(UncaughtExceptionHandler handler) {
            setUncaughtExceptionHandler(handler);
            start();
        }

        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }
}

// 2. Вызвать статический метод класса Thread — setDefaultUncaughtExceptionHandler(). Это можно. Если вызовем и туда пихнём наш хэндлер, то все нити будут именно им пользоваться. В реальном проекте нафиг-нафиг. Но знать полезно.

// 3. Вызвать метод setUncaughtExceptionHandler() у ___объекта___ (а не как тут ниже в комментах просто класса) класса Thread. Вот, то что нужно. Б
// ерем наши нитки, и каждой через эту функцию посылаем приветик, в виде handler, чтобы она знала как обрабатывать такие эксцепшены