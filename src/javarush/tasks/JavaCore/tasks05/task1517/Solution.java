package javarush.tasks.JavaCore.tasks05.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;
    
    static {
        //throw an exception here - выбросьте эксепшн тут
        try {
            throw new ExceptionInInitializerError();
            
        } catch (Exception ex){
               // ex.printStackTrace();
                
        }
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
