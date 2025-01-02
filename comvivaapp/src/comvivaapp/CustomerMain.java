package comvivaapp;

//another class
public class CustomerMain {
	public static void main(String[] args) {
		System.out.println("1st customer ...");
		Customer customer1 = new Customer(91872,"Nikitha", 5600);
	//	customer1.billAmount = 3400;
		customer1.setBillAmount(3400);
		customer1.printCustomerDetails();
		System.out.println("2nd customer ...");
		Customer customer2 = new Customer();
		customer2.printCustomerDetails();
		System.out.println("3rd customer ...");
		Customer customer3 = new Customer("Pritam");
		customer3.printCustomerDetails();

	}
}
