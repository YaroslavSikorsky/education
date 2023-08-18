package javarush.tasks.JavaCore.tasks08.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
	public static void main(String[] args) {

//		//String[] args = new String[2];
//		try {
//			FileInputStream is = new FileInputStream(args[2]);
//			FileOutputStream os = new FileOutputStream(args[3]);
//			if (args.length != 0 && args[0].equals("-e")) {
//				os.write(is.read() - 1);
//			} else if (args.length != 0 && args[0].equals("-d")) {
//				os.write(is.read() + 1);
//			}
//			is.close();
//			os.close();
//		} catch (IOException e) {
//
//		}

      //  String fileName;
        try {
            FileInputStream is = new FileInputStream(args[1]);
            FileOutputStream os = new FileOutputStream(args[2]);
            if (args[0].equals("-e")) {
                while (is.available() > 0) {
                    os.write(is.read() + 1);
                }
            } else if (args[0].equals("-d")) {
                while (is.available() > 0) {
                    os.write(is.read() - 1);
                }
            }
            is.close();
            os.close();
        } catch (IOException e) {

        }


	}
}

