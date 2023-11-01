package javarush.tasks.JavaCore.tasks09.task1906;

import java.io.*;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileReader reader = new FileReader(br.readLine());
            FileWriter writer = new FileWriter(br.readLine());
            int count = 0;
            int t;
            while((t = reader.read()) != -1){
                count++;
                if (count % 2 == 0){
                   writer.write(t);
                }
            }
            br.close();
            reader.close();
            writer.close();
        } catch(IOException ex){
            
        }
    }
}
