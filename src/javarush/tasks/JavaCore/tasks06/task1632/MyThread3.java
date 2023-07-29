package javarush.tasks.JavaCore.tasks06.task1632;


public class MyThread3 extends Thread {
    @Override
    public void run(){
        try{
            while(true){
                System.out.println("Ура");
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            
        }
    }
    
}