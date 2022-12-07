package abstractDemo;

public class CustomerManager {
	
	BaseDataBaseManager databaseManager;
	OracleDatabaseManager oracleDatabaseManager;
	
	public void getCustomers() {
		databaseManager.getData(); 

	}
}
