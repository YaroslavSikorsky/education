package javarush.tasks.JavaCore.tasks05.task1522;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
	public static void main(String[] args) {

	}

	public static Planet thePlanet;

	//add static block here - добавьте статический блок тут

	public static void readKeyFromConsoleAndInitPlanet() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			str = reader.readLine();
			if (str.equals("sun")) {
				thePlanet = Sun.getInstance();
			} else if (str.equals("moon")) {
				thePlanet = Moon.getInstance();
			} else if (str.equals("earth")) {
				thePlanet = Earth.getInstance();
			} else thePlanet = null;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static {
		readKeyFromConsoleAndInitPlanet();
	}
}
