package javarush.tasks.JavaSyntaxPro.tasks09.task1819;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* 
Как быть, если в списке есть элемент null
*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";
        list.stream().map(s -> Optional.ofNullable(s).orElse(text)).forEach(System.out::println);
        // создание опшнала для упрваления контролем плохая практика, оно создавалось для других целей
    }
}
