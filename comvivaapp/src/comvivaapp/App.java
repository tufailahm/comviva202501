package comvivaapp;

import java.util.Date;
import java.util.Scanner;

import finance.Salary;

public class App {
		public static void main(String[] args) {
			System.out.println("Hello Comviva");
			
			Date d = new Date();
			System.out.println("Today date is :"+d);
			
			Salary s = new Salary();
			System.out.println(s.calculateSalary());
			
			Scanner sc = new Scanner(System.in);
		}
}
