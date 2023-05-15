package javarush.tasks.JavaSyntaxPro.tasks08.task1707;

public class Dog extends Pet {
    public static final String DOG = "Я люблю людей.";

    public void printInfo(){
        super.printInfo();
        System.out.println(DOG);
    }
}
