package javarush.tasks.JavaCore.tasks03.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
         
            try { 
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
                String fileName = reader.readLine(); // считываем путь к файлу 
                FileInputStream inputStream = new FileInputStream(fileName);   // создаем поток для чтения файла
                while (inputStream.available() > 0) { // пока в файле есть данные
                    int data = inputStream.read(); // считываем очередной байт 
                    System.out.print((char) data); // выводим символ (байт преобразуется в символ)
                    } 
                    inputStream.close(); // закрываем поток чтения файла 
                    reader.close(); // закрываем поток чтения с консоли\
                    } catch (Exception e) {
                        e.printStackTrace();
                        
                    } 
            
        
            
        }
    
}