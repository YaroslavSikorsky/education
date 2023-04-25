package javarush.tasks.tasks08.task1706;

/* 
Хищники vs Травоядные
*/

public class Solution {
    public static void main(String[] args) {
        printRation(new Cow());
        printRation(new Lion());
        printRation(new Elephant());
        printRation(new Wolf());
    }

    public static void printRation(Animal animal){
        String herbivore = "Любит траву";
        String predator = "Любит мясо";

        if (animal instanceof Predator){
            System.out.println(predator);
        } else if (animal instanceof Herbivore){
            System.out.println(herbivore);
        }
    }
}
