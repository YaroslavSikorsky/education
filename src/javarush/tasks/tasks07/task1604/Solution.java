package javarush.tasks.tasks07.task1604;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar();

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        
        Date date = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("EEEE", Locale.forLanguageTag("ru"));

        return format.format(date);
    }
}
