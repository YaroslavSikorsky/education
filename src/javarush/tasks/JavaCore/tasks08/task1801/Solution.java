package javarush.tasks.JavaCore.tasks08.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int sum = 0; int one = 0;
        while(inputStream.available() > 0) {
           one = inputStream.read();
           if (one > sum){
               sum = one;
           }
        }
        System.out.println(sum);
        inputStream.close();
        reader.close();
    }
}
