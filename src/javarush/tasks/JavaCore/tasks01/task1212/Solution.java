package javarush.tasks.JavaCore.tasks01.task1212;

/* 
«Исправь код», часть 1
*/

public class Solution {
    public static  void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
