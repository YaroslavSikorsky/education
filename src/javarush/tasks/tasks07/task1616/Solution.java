package javarush.tasks.tasks07.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/* 
Тренировка временных зон
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> ts = new TreeSet();
        for (String s: ZoneId.getAvailableZoneIds()){
            ts.add(s);
        }
    
        return ts;
    }

    static ZonedDateTime getBeijingDateTime() {
        ZoneId zone = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time = ZonedDateTime.now(zone);

        return time;
    }
}
