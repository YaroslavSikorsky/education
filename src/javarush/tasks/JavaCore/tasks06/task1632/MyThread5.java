package javarush.tasks.JavaCore.tasks06.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyThread5 extends Thread  {
    @Override
    public void run(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int count = 0;
        try{
            while (!Thread.currentThread().isInterrupted()){
                str = reader.readLine();
                
                if(str.equals("N")){
                    System.out.println(count);
                    Thread.currentThread().interrupt();
                }
                count = count + Integer.parseInt(str);
            } 
        } catch (IOException e){
            System.out.println("IOException");
        }
    }   
    
}

    