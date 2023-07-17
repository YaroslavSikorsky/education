package javarush.tasks.JavaCore.tasks05.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] words = url.split("\\?");
        String[] words2 = words[1].split("&");
        //  for (String word2: words2){
        //         System.out.println(word2);
        //      }
        for (String word2: words2){
             String[] words3 = word2.split("=.+");
             for (String word3: words3){
                System.out.println(word3);
             }
        }
        for (String word2 : words2){
            if (word2.contains("obj")){
                System.out.println();
                try {
                    alert(Double.parseDouble(word2.substring(word2.indexOf("=")+1)));
                } catch (Exception e){
                   alert(word2.substring(word2.indexOf("=")+1));
                }
                
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
