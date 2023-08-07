package javarush.tasks.JavaCore.tasks08.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        try {
            while (true){
                name = reader.readLine();
                FileInputStream input = new FileInputStream(name);
                if (((int) input.available()) < 1000 ){
                    input.close();
                    throw new DownloadException();
                } 
            }
        } catch (IOException e){
            
        }
        
    }

    public static class DownloadException extends Exception {

    }
}

