package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
	Product product = new Product ();
	product.setName("laptop");
	product.id = 1 ;
	product.setDescriptions("asus laptop");
	product.setPrice(5000) ;
	product.setStockAmount(3) ;
	
	ProductManager productManager = new ProductManager() ;
	productManager.Add(product);
	System.out.println(product.getKod());
	}

}
