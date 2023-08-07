package javarush.tasks.JavaCore.tasks08.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int sum = 0; int one = 0; int count = 0;
        while(inputStream.available() > 0) {
           one = inputStream.read();
           if (count < 1){
               sum = one; 
               count++;
           }
           if (one < sum ){
               sum = one;
           }
        }
        System.out.println(sum);
        inputStream.close();
        reader.close();
    }
}

