package javarush.tasks.JavaCore.tasks03.task1302;

/* 
Пиво-2. Возвращение
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
       public  boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }

        }
      @Override
       public boolean isAlcoholic(){
           return true; 
        }

    }
}