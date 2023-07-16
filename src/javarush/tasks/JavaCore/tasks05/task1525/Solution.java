package javarush.tasks.JavaCore.tasks05.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
	public static List<String> lines = new ArrayList<String>();
	public static BufferedReader reader;
	static {
		try {
		    reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
			while (reader.ready()) {
				lines.add(reader.readLine());
			}

		} catch (FileNotFoundException e) {
		//	e.printStackTrace();
			 System.out.println("Файл не найден!");
		} catch (IOException e) {
		//	e.printStackTrace();
			 System.out.println("Ошибка чтения файла!");
		}  finally {
			if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Ошибка закрытия файла!");
                }
            }
		}
	}
	

		public static void main (String[]args){
			System.out.println(lines);
		}
	
}
