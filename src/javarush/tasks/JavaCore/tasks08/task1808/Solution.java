package javarush.tasks.JavaCore.tasks08.task1808;

import java.io.*;
/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) {
        
        
        
        try {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          String file1 = reader.readLine();
          String file2 = reader.readLine();
          String file3 = reader.readLine();
          reader.close();
          
          FileInputStream input = new FileInputStream(file1);
          FileOutputStream output1 = new FileOutputStream(file2);
          FileOutputStream output2 = new FileOutputStream(file3);
          
          int half = input.available()/2;
          int offset = half + input.available() % 2;
         
          byte[] buffer1 = new byte[(int) offset];
          byte[] buffer2 = new byte[(int) half];
          
          input.read(buffer1);
          input.read(buffer2);
          
          output1.write(buffer1);
          output2.write(buffer2);
           
          input.close();
          output1.close();
          output2.close();
                
        } catch (IOException e){
            System.out.println("IOException");
        }
        
    }
}
