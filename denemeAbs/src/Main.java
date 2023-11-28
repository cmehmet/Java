public class Main {
    public static void main(String[] args) {

        /*
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager();// Strateji deseni
        customerManager.addCustomers();
        */

        CustomerManager customerManager = new CustomerManager(new OracleDatabaseManager());
        customerManager.addCustomers();
    }
}