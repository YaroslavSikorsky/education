package javarush.tasks.JavaCore.tasks09.task1909;

import java.io.*;


/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String file1 = br.readLine();
            String file2 = br.readLine();
            BufferedReader reader = new BufferedReader(new FileReader(file1));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
            
            int buffer;
            while (reader.ready()) {
                buffer = reader.read();
                if (buffer == '.') buffer = '!';
                writer.write(buffer);
            }
            
            br.close();
            reader.close();
            writer.close();
            
            
        } catch (IOException e){
            
        }
    }
}
