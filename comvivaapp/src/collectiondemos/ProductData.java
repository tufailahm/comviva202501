package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductData {

	public ProductData() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		
		Product product1 = new Product(1919, "Mouse", 900, 999, "Good");
		products.add(product1);
		products.add(new Product(8272, "Pen Drive", 99, 1, "Okay"));
		products.add(new Product(85221, "Apple", 9799, 8, "Excellent"));
		products.add(new Product(11212, "Laptop", 2399, 99, "Good"));
		products.add(new Product(121, "Laptop", 2399, 9625, "Good"));
		products.add(new Product(12121, "Laptop", 2399, 9, "Okay"));

		
		//to do
		//print all product object one by one 
		//using iterator

		System.out.println(products);
		Collections.sort(products);		
		
		System.out.println("After sorting");
		
		System.out.println(products);
	}

}
