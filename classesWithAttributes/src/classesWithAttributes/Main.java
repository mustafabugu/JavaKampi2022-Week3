package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product = new Product(1, "Asus", "Laptop", 5);
		product.setId(1);
		product.setName("Asus");
		product.setDescription("Laptop");
		product.setPrice(5000);
		product.getKod();

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
	}

}
