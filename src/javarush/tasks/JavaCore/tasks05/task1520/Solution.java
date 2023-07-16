package javarush.tasks.JavaCore.tasks05.task1520;

/* 
Тренировка мозга
*/

public class Solution {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Util.fly(duck);
        Util.move(duck);
    }

    public static class Duck implements CanFly, CanMove {
        @Override
        public void doAction() {
            System.out.println("Flying");
        }
        
         public void doAnotherAction(){
            System.out.println("Moving");
        }
    
    }

    public static class Util {
        public static void fly(CanFly animal) {
            animal.doAction();
        }

        public static void move(CanMove animal) {
            animal.doAnotherAction();
        }
    }

    public static interface CanFly {
        public void doAction();
    }

    public static interface CanMove {
        public default void doAnotherAction(){
            System.out.println("Moving");
        }
    }
}
