package javarush.tasks.JavaCore.tasks04.task1408;

public abstract class Hen {

	public abstract int getCountOfEggsPerMonth();

	public String getDescription() {
		String str = "Я - курица.";

		System.out.println(str);
		return str;
	}


}
