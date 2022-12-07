package abstractDemo;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
//		customerManager.databaseManager = new SqlServerDatabaseManager();
		customerManager.databaseManager = new OracleDatabaseManager();
		customerManager.getCustomers();

		CustomerManager customerManager2 = new CustomerManager();
		customerManager2.databaseManager = new MySqlDatabaseManager();
		customerManager2.getCustomers();

	}
}
