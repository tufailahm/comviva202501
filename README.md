<pre>
<h2>
"# comviva202501" 

https://github.com/tufailahm/comviva202501


JDK  : https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html
Eclipse IDE : https://www.eclipse.org/downloads/packages/release/2024-06/


Introduction to Java
•	Features of Java
•	JDK, JRE and JVM
•	OOPs


Java Development Kit - JRE, JVM , libraries ie String class


JRE - JVM , libraries

What is java ?


# Java

Java is an Object Oriented Programming language.
 It was picked up by Oracle, that develops 1 common implementation of the JRE and JDK, 
and through their (and others) efforts,
 Java has become very widely used.

## Features/Characteristics

- Object Oriented
- Strongly and Statically Typed
- Leverages Java ByteCode (.class files) to accomplish distribution of Java programs
    - Makes it easier to share/collaborate
- Garbage Collector handles Memory Management for the developer
- The JVM is small, and so can be run on many different platforms
    - Particularly useful for embedded systems (Raspberry Pis)
- Many standard libraries are provided
- Relatively performant
    - Not as fast as C or C++, but faster than most other languages
- As of Java 8, introduced some APIs for Functional Programming

## JVM / JRE / JDK

JDK stands for Java Devlopment Kit

JRE stands for Java Runtime Environment

JVM stands for Java Virtual Machine

JDK contains the JRE, 
as well as many different developer tools, 
such as the compiler or the archiver.

JRE contains the JVM as well as supporting libraries 
that the JVM needs to function.

The Java Compiler is the executable that produces 
Java ByteCode from Java Source Code (From .java to .class)

The JVM (along with the libraries from the JRE) 
executes the Java ByteCode.


10:13

15 minutes


class welcome
{
	public static void main(String[] args)
	{
		System.out.println("Mohammad Tufail Ahmed");
	}
}
class Hello
{
	public static void main(String[] args)
	{
		System.out.println("Welcome Hello");
	}
}
class Demo
{
}
public class comviva
{
		
}


Eclipse IDE
=============

Packages in java
==============
Predefined packages in java : java.util, java.io, lang (by default)

User defined packages


Hands on :
Create two packages
hr
	Clerk
		work()
finance
	Salary
		calculateSalary()

Call these two methods inside main method of App class


15 Minutes


Inheritance in java
===============
extends



Access Specifiers
===============

public
private
protected
default

<br>----------------------------------
Hands on - Packages
===========================================
Hands on:
	Create a new project named zooapp in which create a package named org.animals.
In that create various classes like Lion, Monkey, Elephant. 
In each class create data members like color, weight and age.
Create methods like isVegetarian, canClimb, getSound.
	Create another package called zoo and
create a class called VandalurZoo and create objects for the animals that are existing in zoo
and print the characteristic of each animal.

Recommended duration: 20 Mins

===================

Next topics
 Enhanced for introduced in JDK 1.5
Control Flow statements 
if else
switch

•	Constructors
•	Default and Args Constructor
•	Getters and Setters
•	Data types and Operators
•	Arrays 
•	
•	Enums
Class Design
•	Class and Objects
•	Instance Variables and Static Variables
•	Methods and Constructors

float f=1/3; 
int i=1/3;
float f=1.01;




Java has 8 primitive datatypes that are NOT objects. 
These primitive datatypes are generally stored on the stack (if they are local variables).
- int
    - 4 bytes = 32 bits
- double
    - 8 bytes = 64 bits
- byte
    - 1 byte = 8 bits
- boolean
    - 1 byte = 8 bits (sort of)
    - JVM dependent
    - They can potentially be stored in only 1 bit, if many booleans are created
    - Among other optimizations
- char
    - 2 bytes = 16 bits
- long
    - 8 bytes = 64 bits
- float
    - 4 bytes = 32 bits
- short
    - 2 bytes = 16 bits


numbers

byte
short
*int
long

decimal

float
*double

int marks = 90;
float grade = 67.7;
byte rate = 500;

byte b1 = 10;
byte b2 = 20;
byte b3 = b1 + b2;


float f=1/3; 
int i=1/3;
float f=1.01;



		long b11 = 10;
		long b22 = 20;
		long b33 = b11 + b22;


Hands on : 10 minutes

Print default values of all primitive data types


==============================

Constructor in java

--------------------------
special method same name as class name
used to initizlize member variables/attributes
will be automatically invoked whenever you create an object.

package comvivaapp;

public class Customer {
	int customerId=199;
	String customerName="Karthik";
	int billAmount=8500;
	
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
	public static void main(String[] args) {
		System.out.println("1st customer ...");
		Customer customer1 = new Customer(91872,"Nikitha", 5600);
		customer1.printCustomerDetails();
		System.out.println("2nd customer ...");
		Customer customer2 = new Customer();
		customer2.printCustomerDetails();
		System.out.println("3rd customer ...");
		Customer customer3 = new Customer("Pritam");
		customer3.printCustomerDetails();

	}
}






Create a Product class inside com.training.comviva.model package with following attributes 
productId		int
productName	String
quantityOnHand	int
price		int

a) Make all the above fields as private
b) Create default and parametrized constructor 

a) create three product objects and assign different product details
b) Print all the three products information

20 minutes


Getters and Setters
================

Used to access and modify the member variable outside the class.

Hands on :

Create a class named Visitor with following properties :
visitorId
visitorName
purpose
contactPerson
1) Create all the possible constructors
2) Create setters and getters for all member variables
   
Create another class VisitorMain to register three register.
b) The contact person for all the three are same i.e Pursottam
c) Create first visitor as new Visitor(19191,"Tufail","Training","Pursottam");
d) Create second visitor as new Visitor(19192,"Neha","Meeting");
d) Create third visitor as new Visitor(19193,"Tarun","Interview");

Types of variables

instance 
local
static


Use case : I want to count customers orders


Over loading

Constructor Overloading

Hands On : Overload methods to calculate sum of two and three numbers
using int , byte and short data types.

10 minutes

Inheritance
===============


Every class in java inherits from Object class, 
if they dont inherit from other classes
super class for all the classes - Object

*Multiple inheritance is not allowed 

Employee:Object
PermanentEmployee:Employee

 Object

toString
equals
finalize
wait
notify

==		- reference
equals		- value



Parent class object holding child class reference
How to call GC ( System.gc());


package inherit;

class Employee extends Object
{
	int employeeId;
	String employeeName;
	int salary=10000;
	public void markAttendance() {
		System.out.println("Employee Marked the attendance");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("FINALIZE CALLED");
	}
}
class PermanentEmployee extends Employee 
{
	int regularSalary;
	int salary=500000;
	public void allocateProject() {
		int salary=8000000;
		System.out.println(salary);
		System.out.println(this.salary);
		System.out.println(super.salary);
		System.out.println("Permanent Employee project allocated");
	}
}
class ContractEmployee extends Employee 
{
	int payPerHour;
	public void issueTemporaryPass() {
		System.out.println("Contract Employee pass issued");
	}
	public void markAttendance() {
		System.out.println("Contract employee attandance marked");
	}
}
public class EmployeeApp {
	public static void main(String[] args) {
		System.out.println("Way 1");
		//way 1
		PermanentEmployee obj1 = new PermanentEmployee();
		obj1.markAttendance();
		//obj1.allocateProject();
		ContractEmployee obj2 = new ContractEmployee();
		obj2.markAttendance();
		//obj2.issueTemporaryPass();
		
		//way 2
		System.out.println("Way 2");
		Employee e1 = new PermanentEmployee();
		e1.markAttendance();
		e1 = new ContractEmployee();
		e1.markAttendance();
		
		obj1 = null;
		obj2 = null;
		e1 = null;
		System.gc();  //calls the GC
	
	}
}





Abstract class and Interfaces
=====================


Exception Handling
=================
Object
|
Throwable
	|
Error	and 	Exception (Checked)
		
		RuntimeException (Unchecked)
			ArthimeticException

		IOException (Checked)
		InterruptedException (Checked)
		ClassNotFoundException (Checked)




public class Tester {
	static int m(int i) {
		try {
			System.out.println("TRY block CALLED");
			i++;
			if (i == 1)
				throw new Exception();
		} catch (Exception e) {
			System.out.println("CATCH block CALLED");
			i += 10;
			return i;
		} finally {
			System.out.println("FINALLY block CALLED");
			i += 5;
		}
		i++;
		return i;
	}

	public static void main(String[] args) {
		System.out.println(m(0));
	}
}



InvalidUserException extends Exception
InvalidPasswordException extends RuntimeException


throw - brings an exception
throws - delegate an exception


================================


Threads and Collections


- Light weight processes
- concurrent programming
- real times examples : OS
- Thread

Two ways

--- by extending Thread class 
--- by implementing Runnable interface


run


Different states of thread

NEW
NOt initialized
NOT running
RUNNABLE
RUNNING
DEAD




---Thread methods

sleep
run
interrupt
join
	wait
	notify
	notifyall
yield
start
setName




-----
Yield


---Running to runnable
---Give chance to other threads to execute before itself

----Real time -- Yield


#THREAD ::  2: 3
#THREAD ::  2: 2
#THREAD ::  2: 1
#THREAD ::  1: 3
#THREAD ::  1: 2
#THREAD ::  1: 1
#THREAD ::  3: 3
#THREAD ::  3: 2
#THREAD ::  3: 1
#THREAD ::  4: 3
#THREAD ::  4: 2
#THREAD ::  4: 1


package threaddemos;
public class YieldingThread1 extends Thread
{
	private int countDown = 3;
	private static int threadCount = 0;

	public YieldingThread1()
	{
		super("COMVIVA" + ++threadCount);
    		start();
	}
	public String toString()
	{
		return "#" + getName() + ": " + countDown;
	}
	public void run()
	{
		while (true)
		{
			System.out.println(this);
			if (--countDown == 0)
				return;
			Thread.yield();
		}
  	}
	public static void main(String[] args)
	{
		for (int i = 0; i <3; i++)
			new YieldingThread1();
	}
}


Thread synchronization - Locking
=============================
Synchronization is the cooperative act of two or more threads that ensures that 
each thread reaches a known point of operation in relationship to other threads before continuing. 
Attempting to share resources without correctly using 
synchronization is the most common cause of damage to application data.

package threaddemos;

//shared resource
class TwoStrings
{
	static synchronized void  print(String str1, String str2)  //locked
	{
		System.out.print(str1);
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException ie)
		{
		}
		System.out.println(str2);
	}
}

class PrintStringsThread implements Runnable
{
	Thread thread;
	String str1, str2;
	PrintStringsThread(String str1, String str2)
	{
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();
	}
	public void run()
	{
		TwoStrings.print(str1, str2);
	}
}
public class SyncDemo1
{
	public static void main(String args[])
	{
		new PrintStringsThread("Neha  ", "Kapoor");
		new PrintStringsThread("Tarun  ", "Sinha");
		new PrintStringsThread("Karthik   ","Aryan");
	}
}


==========================

package threaddemos;
public class DeadlockExample {
    // Resource 1
    private static final Object resource1 = new Object();
    // Resource 2
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());

        thread1.start();
        thread2.start();
    }

    static class Task1 implements Runnable {
        @Override
        public void run() {
            synchronized (resource1) {
                System.out.println("Thread 1: Holding resource 1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for resource 2...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Acquired resource 2!");
                }
            }
        }
    }

    static class Task2 implements Runnable {
        @Override
        public void run() {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding resource 2...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for resource 1...");
                synchronized (resource1) {
                    System.out.println("Thread 2: Acquired resource 1!");
                }
            }
        }
    }
}

What is Wrapper classes
====================
int	Integer
float	Float
short	Short


String marks = "90";
Integer i = Integer.parseInt(marks);
System.our.println(i+5);









Collections
===================
-- Library to use data structures
-- framework - pre defined set of apis
-- No Need to reinvent the wheel
-- Pre defined set of classes and interfaces
-- Lots of choices 
-- Reduces your learning curve

Use case : Accept five numbers and print in ascending order.

java.util

Colletction<I>
Set<I> (No duplicates)	List<I>(duplicates)	        Map<I>

HashSet(no order)			ArrayList ( not thread safe)
TreeSet(sorted)		LinkedList (not synchronized, not thread safe)
LinkedHashSet(As you insert)		Vector (synchronized, thread safe)

No, LinkedList in Java is not synchronized. This means that it is not thread-safe by default.

Collections<C>

Hands On : Threading

A prompt asking a question appears for which user is given 1 minute. 
If user answers the question before 1 minute then “Congratulations!” is displayed. 
Otherwise “Better Luck Next Time” is displayed.
Write a program to implement the above scenario.
(30 mins)


package threaddemos;

import java.util.Scanner;

public class SolutionExcercise extends Thread {

	Scanner scanner = new Scanner(System.in);
	String name;
	Thread main = Thread.currentThread();
	@Override
	public void run() {
		System.out.println("Please enter your name : ");
		name = scanner.next();
		main.interrupt();
	}
	public static void main(String[] args) {
		SolutionExcercise s = new SolutionExcercise();
		s.display();
	}
	public  void display() {
		Thread.currentThread().setPriority(MAX_PRIORITY);
		SolutionExcercise s = new SolutionExcercise();
		s.start();
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
		//	System.out.println("main Thread intrupted");
		}
		System.out.println(main.isInterrupted());
		System.out.println(main.isInterrupted());
		if(main.isInterrupted()) {
			System.out.println("Better Luck next time");
		}
		else
		{
			System.out.println("Congratulations");

		}
	}
}


---------------------


package threaddemos;

import java.util.Scanner;

public class Handson3 extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(10000);
			System.out.println("Time up");
		} catch (InterruptedException e) {
			System.out.println("congratulations");
		}
	}
	
	public static void main(String[] args) {
		Handson3 h = new Handson3();
		h.start();
		Scanner sc = new Scanner(System.in);
	System.out.println("You have ten seconds to state your age: ");
		Integer n = sc.nextInt();
		h.interrupt();
	}

}

==============================


Collection ( contd)


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

---------------------------------------
Product.java
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











===================

Comparable 	vs Comparator interface

java.lang		java.util
same class	different class

compareTo(o1)	compare(o1,o2)



-----------

Map<K,V> (will not accept duplicate keys)

TreeMap	- sorted on keys
HashMap - no order is guranteed HashMap is not synchronized by default
LinkedHashMap - as you enter
HashTable - sync and thread safe





HTML
========

Hyper text mark up language

tags

<h1>Hi</h1>

<br/>

<body bgcolor="red" background="hello.jpg">
</body>

<font size="20">Comviva</font>  ** Deprecated  By CSS


file:///E:/Trainings/2025/1.Comviva/comviva202501/productapp/saveProduct.html?productId=100&productName=Aroma&quantityOnHand=100&price=99



file:///E:/Trainings/2025/1.Comviva/comviva202501/productapp/saveProduct.html?company=comviva

NW :
file:///E:/Trainings/2025/1.Comviva/comviva202501/productapp/saveProduct.html?	


file:///E:/Trainings/2025/1.Comviva/comviva202501/productapp/saveProduct.html?productId=100&productName=Aroma&quantityOnHand=100&price=99

file:///E:/Trainings/2025/1.Comviva/comviva202501/productapp/saveProduct.html?productId=100&productName=Aroma&quantityOnHand=100&price=99&gst=18


file:///E:/Trainings/2025/1.Comviva/comviva202501/productapp/saveProduct.html?gst=21&productId=100&productName=Aroma&quantityOnHand=100&price=99	


Use case : We want to include update functionality as well.

HTML new tags

Semantic tags
section
header
footer
aside



===========


	 <tr>
                <td rowspan="3" valign="top">Email</td>
                
            </tr>
            <tr>
            </tr>
            <tr>
                <td rowspan="3" valign="bottom" >
                    Official : rahul@dxc.com<br/>
                    Personal : rahul@gmail.com
                </td>
            </tr>

=======

<a href="product.html" target="_blank">

Javascript
==========
	client side
	server sides

Use case : We want to print Hello Comviva 100 times.











