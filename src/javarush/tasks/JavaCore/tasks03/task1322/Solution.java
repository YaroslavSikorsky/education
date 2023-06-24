package javarush.tasks.JavaCore.tasks03.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject;
    }

    interface SimpleObject<T> {
        public SimpleObject<T> getInstance();
    }
    
    public static class StringObject implements SimpleObject<String>{
        @Override
        public  SimpleObject<String> getInstance(){
            return new StringObject();
        }
    }
    
    
   
}
