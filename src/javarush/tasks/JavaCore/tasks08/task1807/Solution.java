package javarush.tasks.JavaCore.tasks08.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//         String fileName = reader.readLine();
//         int count = 0;
//         try (FileInputStream inputStream = new FileInputStream(fileName){
//             while (inputStream.available() > 0){
            
//                   if (inputStream.read() == 44){
//                       count++;
                       
//                   }
//             }
//         }
//         System.out.println(count);
       
//     }
// }

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int commaCount = 0;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)){
            while (fileInputStream.available() > 0) {
                
                if (fileInputStream.read() == 44) commaCount++;
            }
        }
        System.out.println(commaCount);
    }
}



