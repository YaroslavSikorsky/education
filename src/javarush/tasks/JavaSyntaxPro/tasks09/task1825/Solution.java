package javarush.tasks.JavaSyntaxPro.tasks09.task1825;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Из потока данных — в строку
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("To", "be", "a", "programmer", "you", "need", "to", "code");

        System.out.println(getString(stringStream));
    }

    public static String getString(Stream<String> stringStream) {
        //напишите тут ваш код
        return stringStream
                .collect(Collectors.joining(" "));
    }
}
