package javarush.tasks.JavaSyntaxPro.tasks08.task1707;

public class Cat extends Pet {
    public static final String CAT = "Я не люблю людей.";

      public void printInfo(){
        super.printInfo();
        System.out.println(CAT);
    }
}
