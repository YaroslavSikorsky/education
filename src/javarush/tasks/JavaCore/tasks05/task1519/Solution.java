package javarush.tasks.JavaCore.tasks05.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = reader.readLine()) != null) {
			try {
				if (str.equals("exit")) {
					break;
				} else if (str.contains(".")) {
					print((Double) Double.parseDouble(str));
				} else if (Integer.parseInt(str) > 0 && Integer.parseInt(str) < 128) {
					print((short) Integer.parseInt(str));
				} else if (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128) {
					print((Integer) Integer.parseInt(str));
				} else {
					print(str);
				}
			} catch (Exception e) {
				print(str);
			}
		}

	}

	public static void print(Double value) {
		System.out.println("Это тип Double, значение " + value);
	}

	public static void print(String value) {
		System.out.println("Это тип String, значение " + value);
	}

	public static void print(short value) {
		System.out.println("Это тип short, значение " + value);
	}

	public static void print(Integer value) {
		System.out.println("Это тип Integer, значение " + value);
	}
}
