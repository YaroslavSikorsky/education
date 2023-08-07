package javarush.tasks.JavaCore.tasks08.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Byte> byteSet = new TreeSet<>();
        
        try(FileInputStream inputStream = new FileInputStream(reader.readLine())){
            
            while (inputStream.available() > 0){
            
                    byteSet.add((byte) inputStream.read());
            }
        }    
            
        byteSet.forEach(e -> System.out.print(e + " "));
    }
}
