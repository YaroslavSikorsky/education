package javarush.tasks.JavaCore.tasks05.task1501;

/* 
ООП - Расставить интерфейсы
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable{
        @Override
        public boolean isMovable(){
            return true;
        }
    
        @Override
        public  Object getAllowedAction(){
            return new Object();
        }
        

        @Override
        public Object getAllowedAction(String str){
            return new Object();
        }
        
    }
}
