package javarush.tasks.JavaCore.tasks04.task1408;

public class MoldovanHen extends Hen {

	public int x = 110;


	public int getCountOfEggsPerMonth() {
		return x;
	}

	public String getDescription() {
		String str, str1;
		str = super.getDescription();
		str1 = str + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
		System.out.println(str1);
		return str1;
	}

}
