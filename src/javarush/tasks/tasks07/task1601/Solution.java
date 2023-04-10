package javarush.tasks.tasks07.task1601;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(92, 2, 9);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
         DateFormat formatter = new SimpleDateFormat("EEEE", new Locale("ru", "RU"));
            return formatter.format(date);

        
    }
}
