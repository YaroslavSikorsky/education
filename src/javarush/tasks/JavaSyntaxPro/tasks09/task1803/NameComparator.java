package javarush.tasks.JavaSyntaxPro.tasks09.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor> {
    public int compare (JavaRushMentor jr1, JavaRushMentor jr2)
   {
      return jr1.getName().length() - jr2.getName().length();
   }
}
