package comvivaapp;

public class Customer {
	private int customerId=199;
	private String customerName="Karthik";
	private int billAmount=8500;
	
	public Customer() { //default cons
		System.out.println("Hello Customer Default cons");
		customerName="NA";
		billAmount = 9000;
	}
	public Customer(int customerId,String customerName,int billAmount) { //default cons
		System.out.println("Hello Customer 3 param");
		this.customerId = customerId;
		this.customerName = customerName;
		this.billAmount = billAmount;
	}
	public Customer(String customerName) {
		System.out.println("Hello Customer customername cons");
		this.customerName = customerName;
	}
	public void printCustomerDetails() {
		System.out.println("Customer Id :"+customerId);
		System.out.println("Customer Name :"+customerName);
		System.out.println("Customer Bill Amount :"+billAmount);
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	
	
	
	
	
}
