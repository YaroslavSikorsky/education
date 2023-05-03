package javarush.tasks.tasks09.task1802;

import java.util.Comparator;

/* 
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student> {
    public int compare (Student stud1, Student stud2)
   {
      return stud2.getAge() - stud1.getAge();
   }
}
