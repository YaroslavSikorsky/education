package javarush.tasks.tasks06.task1504;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
           try (Scanner scanner = new Scanner(System.in);
             var input = Files.newInputStream(Paths.get(scanner.nextLine()));
             var output = Files.newOutputStream(Paths.get(scanner.nextLine()))
                 ) {
            
            while (input.available() > 0) {
              if (input.available() == 1) {
                output.write(input.read());
              } else {
                int real1 = input.read();
                int real2 = input.read();
                output.write(real2);
                output.write(real1);
              }

            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }

    }
}

