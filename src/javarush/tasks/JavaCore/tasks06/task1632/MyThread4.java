package javarush.tasks.JavaCore.tasks06.task1632;

public class MyThread4 extends Thread implements Message {
    private static boolean bl = true;
    @Override
    public void run(){
        while (bl) {
           
        }
    }
    @Override
    public void showWarning(){
        bl = false;
    }
 
}
