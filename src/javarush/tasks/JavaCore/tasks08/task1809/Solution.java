package javarush.tasks.JavaCore.tasks08.task1809;

import java.io.*;
import java.util.ArrayList;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try{
                    String file1 = reader.readLine();
                    String file2 = reader.readLine();
                    FileInputStream input = new FileInputStream(file1);
            FileOutputStream output = new FileOutputStream(file2);
            
            ArrayList<Integer> list = new ArrayList<>();
            
            while (input.available() >0){
                int temp = input.read();
                list.add(0, temp);
                
            }
            
            for (int i = 0; i < list.size(); i++){
                output.write(list.get(i));
            }
            
            reader.close();
            input.close();
            output.close();
                } catch (IOException e){
                    
                }
            
            
    }
}




        
       
 