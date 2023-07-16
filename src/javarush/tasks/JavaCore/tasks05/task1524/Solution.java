package javarush.tasks.JavaCore.tasks05.task1524;

/* 
Порядок загрузки переменных
*/

public class Solution {
    
    public static void init() {
        System.out.println("static void init()");
    }
    
    // static {
    //     init();
    // }
    
     static {
        System.out.println("Static block");
    }
    
    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }
     {
        System.out.println("Non-static block");
        printAllFields(this);
    }
     
     
      public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }
    
    public String name = "First name";
    public int i = 6;

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.name);
        System.out.println(obj.i);
    }
}
