package javarush.tasks.JavaCore.tasks02.task1221;

/* 
Все мы немного кошки…
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet {
        @Override
        public String getName(){
            return "Я - кот";
        }

    }
}
