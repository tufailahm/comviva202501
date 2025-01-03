package comvivaapp;

import java.util.Date;

public class Orders {

	int totalBill=8000;		//instance variable - automatically init 0
	static int totalOrders;	//static or class variable
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}
	public Orders(String productName, int quantity) 
	{
		totalOrders++;
	}
	public void takeOrders() {
		
		int totalBill=9000;		//local variable
		System.out.println(totalBill);
		System.out.println(this.totalBill);	
	}
	public void printBill() {
		System.out.println(totalBill);
	}
	public void printBill(int gst) {
		System.out.println(totalBill+gst);
	}
	public static void main(String[] args) {
		Orders o= new Orders("Pendrive",9000);
		Orders o1= new Orders("Mouse",9000);
		Orders o2= new Orders("Laptop",9000);

		System.out.println(o.totalOrders);
		System.out.println(o1.totalOrders);
		System.out.println(totalOrders);
		System.out.println(Orders.totalOrders);
		System.out.println(90);
		System.out.println("KK");
		//System.out.println(totalBill);

		Date d = new Date();
		Date d1 = new Date(7,8,2025);

	}
}



