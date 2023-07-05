package javarush.tasks.JavaCore.tasks04.task1408;

public class RussianHen extends Hen {

	public int x = 120;


	public int getCountOfEggsPerMonth() {
		return x;
	}

	public String getDescription() {
		String str, str1;
		str = super.getDescription();
		str1 = str + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
		System.out.println(str1);
		return str1;
	}


}
