package javarush.tasks.JavaCore.tasks05.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        if (input < 0) {
            System.out.println("0");
        } else {
            System.out.println(factorial(input));
        }
    }

    public static String factorial(int n) {
        //add your code here
        if (n == 0){
            return "1";
        }
        BigDecimal result = BigDecimal.ONE;
        for (int i = 1; i <= n; i++){
        result=result.multiply(BigDecimal.valueOf(i));
        }
        String stringResult = result.toString();
        return stringResult;
    }
}
