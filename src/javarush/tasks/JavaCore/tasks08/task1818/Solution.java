package javarush.tasks.JavaCore.tasks08.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) {
      try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        
        FileOutputStream file1 = new FileOutputStream(name1);
        FileInputStream file2 = new FileInputStream(name2);
        FileInputStream file3 = new FileInputStream(name3);
        
        int byteRead;
        while ((byteRead = file2.read()) != -1){
            file1.write(byteRead);
        }
        while ((byteRead = file3.read()) != -1){
            file1.write(byteRead);
        }
        file1.close();
        file2.close();
        file3.close();
      } catch (IOException ex){
          
          
      }
        
    }
}
