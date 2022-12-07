package polymorphismDemo;

public class CustomerManager {
	private BaseLogger blogger;
	
	public CustomerManager(BaseLogger logger) {
		this.blogger = logger;
	}
	
	public void add() {
		System.out.println("Müşteri Eklendi.");
		this.blogger.log("Log mesajı");
	}

}
 