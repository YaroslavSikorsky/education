package javarush.tasks.JavaCore.tasks09.task1901;

/* 
TableAdapter
*/

public class Solution {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter implements BTable{
        private ATable aTable;
        TableAdapter(ATable aTable){
            this.aTable=aTable;
        }
        @Override
        public String getHeaderText(){
            String s = "[" + aTable.getCurrentUserName() + "]" + " : " + aTable.getTableName();
            return s;
        }
    }

    public interface ATable {
        String getCurrentUserName();

        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    }
}