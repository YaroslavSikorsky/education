package javarush.tasks.JavaCore.tasks04.task1408;

/* 
Куриная фабрика
*/

public class Solution {
	public static void main(String[] args) {
		Hen hen = HenFactory.getHen(Country.BELARUS);
		hen.getCountOfEggsPerMonth();
	}

	static class HenFactory {

		static Hen getHen(String country) {
			Hen hen = null;
			if (country.equals(Country.RUSSIA)) {
				hen = new RussianHen();
			}
			if (country.equals(Country.UKRAINE)) {
				return new UkrainianHen();
			}
			if (country.equals(Country.MOLDOVA)) {
				return new MoldovanHen();
			}
			if (country.equals(Country.BELARUS)) {
				return new BelarusianHen();
			}
			return hen;
		}
	}




}
