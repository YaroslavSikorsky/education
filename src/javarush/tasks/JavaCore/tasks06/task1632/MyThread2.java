package javarush.tasks.JavaCore.tasks06.task1632;


public class MyThread2 extends Thread {
    @Override
    public void run(){
        try{
           Thread.currentThread().sleep(1);
        } catch (InterruptedException e){
            System.out.println("InterruptedException");
        }
    }
}