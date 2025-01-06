package collectiondemos;

import java.util.Objects;

public class Product implements Comparable<Product>{

	private int productId;
	private String productName;
	private int quantityOnHand;
	private int price;
	private String reviews;
	
	@Override
	public int compareTo(Product o) {
		 // TODO Auto-generated method stub
		if(o.getQuantityOnHand() > this.getQuantityOnHand())
		{
			return -1;
		}
		else if(o.getQuantityOnHand() == this.getQuantityOnHand())
		{
			if(o.getPrice() > this.getPrice())
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}
		else {
			return 1;
		}
	}
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int productId, String productName, int quantityOnHand, int price, String reviews) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
		this.reviews = reviews;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getQuantityOnHand() {
		return quantityOnHand;
	}


	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getReviews() {
		return reviews;
	}


	public void setReviews(String reviews) {
		this.reviews = reviews;
	}


	@Override
	public String toString() {
		return "\nProduct [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + ", reviews=" + reviews + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(price, productId, productName, quantityOnHand, reviews);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return price == other.price && productId == other.productId && Objects.equals(productName, other.productName)
				&& quantityOnHand == other.quantityOnHand && Objects.equals(reviews, other.reviews);
	}



}
