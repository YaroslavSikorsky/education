package javarush.tasks.tasks08.task1703;

import java.util.ArrayList;

/* 
Космическая одиссея ч.1
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Human human = new Human();
        Astronaut astronaut = new Human();
        astronauts.add(cat);
        astronauts.add(dog);
        astronauts.add(human);
        astronauts.add(astronaut);
        
       
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
