package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductData {
	
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();

		Product product1 = new Product(1919, "Mouse", 900, 999, "Good");
		products.add(product1);
		products.add(new Product(8272, "Pen Drive", 99, 1, "Okay"));
		products.add(new Product(85221, "Apple", 9799, 8, "Excellent"));
		products.add(new Product(11212, "Laptop", 2399, 99, "Good"));
		products.add(new Product(12121, "Laptop", 2399, 9625, "Good"));
		products.add(new Product(12121, "Laptop", 2399, 9, "Okay"));

		// to do
		// print all product object one by one
		// using iterator

		System.out.println(products);
		Collections.sort(products); // By using Comparable

		System.out.println("After sorting by qoh");

		System.out.println(products);

		System.out.println("After sorting by product id :: ");
		Collections.sort(products, new ProductIdComparator()); // By using comparator
		System.out.println(products);

		System.out.println("After sorting by price :: ");
		Collections.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if (o1.getPrice() > o2.getPrice())
					return 1;
				else
					return -1;
			}
		}); // By using anonymous inner classes
		System.out.println(products);

	}

}
