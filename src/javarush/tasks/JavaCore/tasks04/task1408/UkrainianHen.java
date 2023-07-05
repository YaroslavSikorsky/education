package javarush.tasks.JavaCore.tasks04.task1408;

public class UkrainianHen extends Hen {

	public int x = 90;


	public int getCountOfEggsPerMonth() {
		return x;
	}

	public String getDescription() {
		String str, str1;
		str = super.getDescription();
		str1 = str + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
		System.out.println(str1);
		return str1;
	}

}
