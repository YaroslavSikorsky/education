package javarush.tasks.JavaCore.tasks09.task1904;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;
        
        PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }
        
        public void close(){
         fileScanner.close();   
        }
        
        public Person read(){
            String lastName = fileScanner.next();
            String firstName = fileScanner.next();
            String middleName = fileScanner.next();
            int day = fileScanner.nextInt();
            int month = fileScanner.nextInt();
            int year = fileScanner.nextInt();

            String dateString = String.format("%02d-%02d-%04d", day, month, year);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date birthDate = null;
             try {
                birthDate = dateFormat.parse(dateString);
            } catch (ParseException e) {
                
                
            }

        return new Person(firstName, middleName, lastName, birthDate);
                    
            
        }

    }
}
