package javarush.tasks.JavaCore.tasks08.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
        TableInterface tableInterface;
        String newHeaderText;
        
        public TableInterfaceWrapper(TableInterface tableInterface){
            this.tableInterface = tableInterface;
        }
    
        public void setModel(List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(rows);
        }
        
        public String getHeaderText(){
           return  tableInterface.getHeaderText().toUpperCase();
           
        }

        public void setHeaderText(String newHeaderText){
            tableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        public void setModel(List rows);

        public String getHeaderText();

        public void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}



        
// 1 Создать свой класс-обертку и унаследоваться от того же класса/интерфейса что 
// и оборачиваемый объект.
// 2 Передать оборачиваемый объект в конструктор нашего класса.
// 3 Переопределить все методы в нашем новом классе, и вызвать в них методы 
// оборачиваемого объекта.
// 4 Внести свои изменения «по вкусу»: менять результаты вызовов, параметры 
// или делать что-то еще.