package javarush.tasks.JavaCore.tasks04.task1405;

/* 
Пора покушать
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;
        
        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        food.onSelect();
        food.onEat();
    }

    public static void callSelectableMethods(Selectable selectable) {
         selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        public void onSelect(){
             System.out.println("The food was selected");
        }
        public void onEat() {
            System.out.println("The food was eaten");
        }
    }
}
