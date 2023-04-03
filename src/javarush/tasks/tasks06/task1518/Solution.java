package javarush.tasks.tasks06.task1518;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
А что же внутри папки?
*/

public class Solution {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
      
        try (DirectoryStream<Path> paths = Files.newDirectoryStream(Path.of(new Scanner(System.in).nextLine()))){
            for(Path path: paths){
                System.out.println(Files.isRegularFile(path)? path+THIS_IS_FILE :
                Files.isDirectory(path)? path + THIS_IS_DIR : "Хрень какая-то");
            }
        } catch (IOException e){
            System.out.println("Ошибка - "+ e);
         }
        

    }
}

