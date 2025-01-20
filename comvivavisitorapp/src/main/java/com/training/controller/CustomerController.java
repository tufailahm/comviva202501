package com.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Customer;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	Customer customer;
	
	public CustomerController() {
		
	}

	@GetMapping
	public List<Customer> viewAllCustomers() {

		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1, "Tarun", "1918181818", 8999));
		customers.add(new Customer(2, "Tarun", "1918181818", 8999));
		customers.add(new Customer(3, "Tarun", "1918181818", 8999));
		customers.add(new Customer(4, "Tarun", "1918181818", 8999));

		return customers;
	}

	@GetMapping("9191") // localhost:9090/customer/9191
	public String viewCustomer() {
		return "Fetching customer details for 9191";
	}

	@DeleteMapping("9191") // localhost:9090/customer/9191
	public String deleteCustomer() {
		return "Deleting  customer details for 9191";
	}

	@PutMapping("9191") // localhost:9090/customer/9191
	public String updateCustomer() {
		return "Update customer details for 9191";
	}

	@PostMapping // localhost:9090/customer/9191
	public String saveCustomer() {
		return "Saving customer details for 9191";
	}

	
	@GetMapping("balance") // localhost:9090/customer/balance
	public int fetchBalance() {
		return customer.getBalance();
	}
}








