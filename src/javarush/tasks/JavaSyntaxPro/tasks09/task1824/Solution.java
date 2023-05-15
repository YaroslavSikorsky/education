package javarush.tasks.JavaSyntaxPro.tasks09.task1824;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Из потока данных — в map
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        //напишите тут ваш код
        return stringStream
                .collect(Collectors.toMap(s1->s1, s->s.length()));
    }
}
