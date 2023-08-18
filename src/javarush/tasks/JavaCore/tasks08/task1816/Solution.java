package javarush.tasks.JavaCore.tasks08.task1816;

import java.io.FileReader;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
	public static void main(String[] args) throws IOException {
		int c = 0;
		int b = 0;
		FileReader r = null;
		try {
			r = new FileReader(args[0]);
			while (r.ready()) {
				b = r.read();
				if (b >= 64 && b <= 90 || b >= 97 && b <= 122) {
					c++;
				}
			}
			System.out.println(c);
		} catch (IOException e) {

		} finally {
			r.close();
		}

	}
}
