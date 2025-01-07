package dayByday;

import java.util.List;
import java.util.stream.Collectors;

public class Products {

	String Name;
	int Price;
	String Category;
	
	public Products(String Name, int Price, String Category) {
		this.Name = Name;
		this.Price = Price;
		this.Category = Category;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Products> products = List.of(
		            new Products("Laptop", 15000, "Electronics"),
		            new Products("Phone", 9000, "Electronics"),
		            new Products("Table", 6000, "Furniture"),
		            new Products("Chair", 550, "Furniture"),
		            new Products("LED Light", 110, "Electrical"));
		
List<String> res = products.stream().filter(p -> p.Price > 8000).map(p -> p.Name.toUpperCase()).collect(Collectors.toList());    
		 
		 System.out.println(res);
	}

}
