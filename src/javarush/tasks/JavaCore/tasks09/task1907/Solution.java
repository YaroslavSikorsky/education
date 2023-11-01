package javarush.tasks.JavaCore.tasks09.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        

        
        try{
            String fileName = reader.readLine();
            BufferedReader reader1 = new BufferedReader(new FileReader(fileName));    
            String line;
            int wordCount = 0;
            
            while ((line = reader1.readLine()) != null) {
                String[] words = line.split("[\\p{Punct}\\s]+");
                for (String word : words) {
                    if (word.equalsIgnoreCase("world")) {
                        wordCount++;
                    }
                }
            }
            System.out.println(wordCount);
            
            reader1.close();
            reader.close();
            
        } catch (IOException e){
            
        }
        
        
    }
}
