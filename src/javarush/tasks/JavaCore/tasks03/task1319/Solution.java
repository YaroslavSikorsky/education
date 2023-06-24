package javarush.tasks.JavaCore.tasks03.task1319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
  
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine(); // считываем имя файла с консоли
            FileInputStream fileInputStream = new FileInputStream(fileName); // создаем объект для чтения файла
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(fileInputStream)); // объект для чтения из файла

            ArrayList<Integer> list = new ArrayList<>(); // создаем список для хранения чисел
            while (fileReader.ready()) { // считываем данные из файла
                int number = Integer.parseInt(fileReader.readLine());
                if (number % 2 == 0) { // добавляем только четные числа
                    list.add(number);
                }
            }
            fileInputStream.close(); // закрываем поток чтения файла
            fileReader.close(); // закрываем поток чтения из файла

            Collections.sort(list); // сортируем список

            for (Integer i : list) { // выводим отсортированные четные числа
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
