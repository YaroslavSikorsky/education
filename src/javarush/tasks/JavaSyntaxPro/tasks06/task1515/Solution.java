package javarush.tasks.JavaSyntaxPro.tasks06.task1515;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str);
        System.out.println(path.isAbsolute()? path : path.toAbsolutePath());
    }
}

