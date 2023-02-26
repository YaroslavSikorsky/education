package javarush.tasks.task00;
import java.util.HashSet;

//	В классе Solution есть метод arrayToHashSet(String[]),который должен из переданного массива вернуть HashSet <String> с теми же элементами.
//	Метод main не участвует в проверке.

public class Solution3 {
	public static void main(String[] args) {
		String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("___________________________________");

		HashSet<String> hashSet = arrayToHashSet(array);
		for (String s : hashSet) {
			System.out.println(s);
		}
	}

	public static HashSet<String> arrayToHashSet(String[] strings) {
		// мой код тут
		HashSet<String> hashSet = new HashSet<>();
		for (String s : strings) {
			hashSet.add(s);
		}
		return hashSet;
	}
}
