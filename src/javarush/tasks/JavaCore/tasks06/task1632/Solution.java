package javarush.tasks.JavaCore.tasks06.task1632;

import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        MyThread1 mythread1 =  new MyThread1();
        threads.add(mythread1);
        MyThread2 mythread2 =  new MyThread2();
        threads.add(mythread2);
        MyThread3 mythread3 =  new MyThread3();
        threads.add(mythread3);
        MyThread4 mythread4 =  new MyThread4();
        threads.add(mythread4);
        MyThread5 mythread5 =  new MyThread5();
        threads.add(mythread5);
        
    }

    public static void main(String[] args) {
          threads.get(1).start();
          threads.get(2).start();
          threads.get(3).start();
          threads.get(4).start();
          threads.get(0).start();
         // threads.get(2).interrupt();
    }
}