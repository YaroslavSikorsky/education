import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.groupingBy;

public class Main {
	public static void main(String[] args) {
		User yura = new User(1, "Юрий Пчелинский", 30);
		User anton = new User(2, "Антон Гацковка", 31);
		User anton2 = new User(3, "Антон Доминатор", 15);
		User yura2 = new User(4, "Юрий Нытье", 4);
		User ivan = new User(5, "Юрий Юифсибог", 16);
		User sasha = new User(6, "Саша Петров", 19);
		User evgeniy = new User(7, "Евгений Хутор", 54);
		User alex = new User(8, "Саша Олейник", 30);
		User jon = new User(9, "Би Хан", 31);
		User ben = new User(10, "Би Хан", 15);
		User jax = new User(11, "Джакс Крар", 4);
		User petr = new User(12, "Петр Пушка", 16);
		User simon = new User(13, "Саймон Горелый", 19);
		User goga = new User(14, "Гога Лужа", 54);
		User luc = new User(15, "Люк Скайуокер", 54);

		ArrayList<User> list = new ArrayList<>();
		list.add(anton);
		list.add(anton2);
		list.add(alex);
		list.add(yura2);
		list.add(evgeniy);
		list.add(jax);
		list.add(sasha);
		list.add(jon);
		list.add(petr);
		list.add(simon);
		list.add(goga);
		list.add(luc);
		list.add(ben);
		list.add(ivan);
		list.add(yura);

		// STREAM
		// 3 Юра - возраст - 1 вариант
//		list.stream()
//			.map(s -> s.getName() + " - " + s.getAge())
//			.forEach(s -> System.out.println(s));

		// 3 Юра - возраст - 2 вариант
//		Map<String, Integer> kata3 = list.stream()
//				.collect(Collectors.toMap(p->p.getName(), t->t.getAge()));
//		kata3.forEach((k,v)->System.out.println(k + " - " + v));

		// 4 Сколько Юр
//		Long x1 = list.stream()
//				.filter(s -> s.getName().contains("Юрий")).count();
//		System.out.println(x1);

		// 5 Средний возраст Антонов
//		Double x = list.stream()
//				.filter(s -> s.getName().contains("Антон"))
//				.mapToInt(User::getAge).average().getAsDouble();
//		System.out.println(x);

		// 6 - вывести имена всех пользователей в формате в порядке убывания длины имени - 1 вариант
//		list.stream()
//				.sorted(Comparator.comparing(user -> user.getName().length(), Comparator.reverseOrder()))
//				.forEach(System.out::println); //1

		// 6 - вывести имена всех пользователей в формате в порядке убывания длины имени - 2 вариант
//		list.stream()
//				.sorted(Comparator.comparing(s -> s.getName().length(), Comparator.reverseOrder()))
//				.forEach(s -> System.out.println(s));

		// 7 нейм - средний возраст
//		Map<String, Double> groupped = list.stream()
//				.collect(groupingBy(User::getName, averagingInt(User::getAge)));
//
//		System.out.println("groupped = " + groupped);

// ------------------------------------------------------------------------

//		int[] array1 = Stream.of("1","2","3","","5")
//				.filter(s -> !s.isEmpty())
//				.mapToInt(Integer::parseInt)
//				.toArray();
//		System.out.println(Arrays.toString(array1));

//		list.stream()
//				.findFirst()
//				.ifPresent(s -> System.out.println("ПЕРВЫЙ " + s));

		list.stream()
				.findAny()
				.ifPresent(s -> System.out.println("ПЕРВЫЙ " + s.getName()));
		// ifPresent работает с Optional

//		list.stream()
//				.filter(s -> s.getName().startsWith("Ю"))
//				.forEach(s -> System.out.println(s.getName() + s.getAge()));

//		list.stream()
//				.map(s -> s.getName().substring(0,4))
//				.forEach(s -> System.out.println(s));

	}
}
