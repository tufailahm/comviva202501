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

<a href="product.html" target="_blank">Open Product Page in new Tab</a>

Javascript
==========
	client side
	server sides

Use case : We want to print Hello Comviva 100 times.


Hands On : Accept two numbers and print the sum.
NB : use parseInt method to parse string into numbers

  function display() {
            alert("Hi")
            var result = confirm("Are you sure");
            var guestName = prompt("Please enter your name :","Guest");
            if (result){
            for(i=1;i<=5;i++)
            document.write("Hello Comviva "+guestName+"<br/>");
            }
            else
            {
                alert("Negative")
            }
        }


============


<script language="javascript">
function display(num1,num2)
{
alert(display.length);
}
< /script>










var str=“abc”;
 or var str= new String(“abc”);

boolean
names = new Array("Mohan","Jay");

-------Math
r=Math.random();
r between 0 and 1.
X=Math.pow(8,3); //512


Write a java script function to get a random number between 0 and 9?

(10 mins)


-------------------

Constructors 
Date() - Use the current date and time to create an instance of the object date. 
today = new Date();
Date(dateString) - Use the date specified by the string to create the instance of the date object. 
d1 = new Date("July 10, 2010 11:13:00");
Date(year, month, day) - Create an instance of date with the specified values. 
Date(year, month, day, hours, minutes, seconds) - Create an instance of date with the specified values where month begins from 0.


getDate()  
  getMonth() 0 indicating Jan
 getYear() 
 getDay()weekday 0 indicating Sunday
 getHours() getMinutes()   getSeconds() 
setDate(value)     setMonth(value) setYear(value)     setHours(value) setMinutes(value)  setSeconds(value) setFullYear(yy,mm,dd)
parse(string)


<html><body>
<script>
var today= new Date();		//15th Jan 2025
var lastdate=new Date();	// 15th Jan 2025
lastdate.setFullYear(2025,0,31);//31stJan 2025
if (lastdate>today)  {
	var day = 1000 * 60 * 60 * 24;
	x=(lastdate-today)/day;
  alert("Number of days left "+x);
  }
else  {
  alert("time up and you cannot apply for quiz");
  }
</script></body></html>


---------

The electricity bill has to be paid before the 15th of every month. Write java script code that will prompt the user to enter the bill number and credit card number (assume that the site has secure payment gateway). 

If the date user pays the bill beyond 10th but before end of the month, then a fine of Rs. 50 is added for each delayed day. Compute the final bill and pop up the result to the user.

15th Jan --------
Enter the bill amount : 8700
Either : Your total bill is : 8700	- 09th Jan 
Or : Your total bill after late fees is : 8950 	- 15th Jan
(15 mins)


===================


Use case : Change image upon hovering

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script type="text/javascript">
        function change(img){
            document.images[0].src = img;
        }
    </script>
</head>
<body>
    <img src="openeyes.jfif" 
    onmouseover="change('closeyes.jfif')" 
    onmouseout="change('openeyes.jfif')">
</body>
</html>

========================


Validating using JS

** All the fields are mandatory
** price and qoh should be negative



==========Dynamic adding options

<html>

<head>
  <script type="text/javascript">
    function remSelOpt(inp1, sel1) {
      len1 = sel1.options.length;
      for (i = 0; i < len1; i++) {
        if (sel1.options[i].value == inp1.value) {
          sel1.options[i] = null;
          break;
        }
      }
    }

    function addSelOpt(inp1, sel1) {
      len1 = sel1.options.length;
      option0 = new Option(inp1.value,inp1.value);
      sel1.options[len1] = option0;
    }  
  </script>
</head>

<body>
  <form>
    Enter what to del:
    <input type=text name="removeOption" onblur="remSelOpt
(this,this.form.selectList)">
    <br>
    enter what to enter:
    <input type=text name="removeOption" 
    onblur="addSelOpt(this,this.form.selectList)">
    <br>
    <select id="selectList" name="selectList">
      <option value="--">--</option>
      <option value="one">one</option>
      <option value="two">two< /option>
      <option value="three" selected="selected">three</option>
    </select>
  </form>
</body>

</html>

Use case : Display error message in page itself.
      <span id="errAdd">

      </span>


js
      var err1 = document.getElementById('errAdd');

         err1.innerHTML = '<font color=red>'+ inp1.value + ' Already present'

Hands On : 14:18 15-01-2025

EMI Calculator

Loan Amount 		:	[ 7000000 ]Loan amount is mandatory
Interest Rate		:	[  ]	Interest rate is mandatory
Duration (in months)	:	[  ]	Duration is mandatory


Your EMI is  : 1772  


Solution :

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        function validateLoanAmount(){
            var loanAmount = document.getElementById('loanAmount').value;


            var lnMsg1 = document.getElementById('lnMsg1');

            if(loanAmount.length == 0)
            {
                 lnMsg1.innerHTML = '<font color=red>Loan amount cannot be empty'
            }
            else
            {
                lnMsg1.innerHTML = ' '
            }
        } 

        function validateRate(){
            var rate = document.getElementById('rate').value;
            var lnMsg2 = document.getElementById('lnMsg2');

            if(rate.length == 0)
            {
                 lnMsg2.innerHTML = '<font color=red>Rate cannot be empty'
            }
            else
            {
                lnMsg2.innerHTML = ' '
            }
        } 
        function validateDuration(){
            var duration = document.getElementById('duration').value;
            var lnMsg3 = document.getElementById('lnMsg3');

            if(duration.length == 0)
            {
                 lnMsg3.innerHTML = '<font color=red>Duration cannot be empty'
            }
            else
            {
                lnMsg3.innerHTML = ' '
                calculateEMI();
            }
        } 
        function calculateEMI(){
            //code here the formula to calculate EMI
            document.getElementById('result').innerHTML = 'Your EMI is : 19191'
        }
    </script>
</head>
<body>
    <form>
        Loan Amount : <input type="text" id="loanAmount" 
        onblur="validateLoanAmount()">
        <span id="lnMsg1"></span>
        <br/>
        Interest rate : <input type="text" id="rate" onblur="validateRate()">
        <span id="lnMsg2"></span>
        <br/>
        Duration : <input type="text" id="duration" onblur="validateDuration()">
        <span id="lnMsg3"></span>
        <br/>
        <div id="result"></div>
    </form>
</body>
</html>



============================================
Hands on : 
Input Age  to check user eligibility to vote : 	[ 21 ]
					< 18
Green < You are eligible to vote>

Yellow < You are not eligible to vote >

-2 or > 100

red < Invalid age > 

Dynamic adding controls
====================
Code :

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script type="text/javascript">
        function add(){
            var mainDiv = document.getElementById('myDiv1'); 
            var newTextBox = document.createElement('input');
            newTextBox.type = 'text';
            newTextBox.id = 'productId';

            var productIdSpan = document.createElement('span');
            productIdSpan.innerText = 'Product Id ';
            mainDiv.appendChild(productIdSpan);
            mainDiv.appendChild(newTextBox);
        }
    </script>
</head>
<body>
    <div id="myDiv1">
        <input id="Button1" 
        type="button" value="Add A text Box" 
        onclick="add()" />
    </div>
</body>

</html>



Hands On : 

Add Guests : [ 56 ]
[Add TextBoxes] - Button 

Guest 1 name [ ]
...
..
..

Guest 56 name [ ]

Soultion :

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script text="text/javascript">
        function add() {
            var counter = document.getElementById('counter').value;
            var mainDiv = document.getElementById('myDiv1'); 
            for (var i = 1; i <= counter; i++) {
                var newLine = document.createElement('br');

                var newTextBox = document.createElement('input');
                newTextBox.type = 'text';
                var newSpan = document.createElement('span');
                newSpan.innerText = 'Guest '+i+ ' name';
                mainDiv.appendChild(newLine);
                mainDiv.appendChild(newSpan);
                mainDiv.appendChild(newTextBox);
            }
        }
    </script>
</head>

<body>
    <div id="myDiv1">
        <input type="text" id="counter">
        <input id="Button1" type="button" value="Add A text Box" onclick="add()" />
    </div>
</body>

</html>

=========================
Working code 
<br/>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script text="text/javascript">
        function check(){
            var counter = document.getElementById('counter');
            if (localStorage.mycounter) {
                counter.value = localStorage.getItem('mycounter')
            }
        }
        function add() {
            var counter = document.getElementById('counter');
            var mainDiv = document.getElementById('myDiv1');
            localStorage.setItem('mycounter', counter.value);

            for (var i = 1; i <= counter.value; i++) {
                var newLine = document.createElement('br');

                var newTextBox = document.createElement('input');



                newTextBox.type = 'text';
                var newSpan = document.createElement('span');
                newSpan.innerText = 'Guest ' + i + ' name';
                mainDiv.appendChild(newLine);
                mainDiv.appendChild(newSpan);
                mainDiv.appendChild(newTextBox);
            }
        }
    </script>
</head>

<body onload="check()">
    <div id="myDiv1">
        <input type="text" id="counter">
        <input id="Button1" type="button" value="Add A text Box" onclick="add()" />
    </div>
</body>

</html>


===============
6th Day
09:26 16-01-2025

J2SE	- core java
J2EE	- enterprise edition ( EE, server side app, ejb, jsp, servlets)
J2ME	- micro edition 

What is Servlet ?

A servlet is a Java class that extends the capabilities of a server. It's often used to add dynamic content to web servers

** How it works 
A servlet container loads and instantiates a servlet
The servlet is initialized using the init() method
The servlet processes client requests using the service() method
The servlet is finalized using the destroy() method
The servlet's memory is garbage collected




Create
Compile
R	un
Deploy our app in web server (tomcat)


Use case : We want to create a server side app to welcome user with a message alongwith the the visitor counter.




Page 1 :
Hello and Welcome.
Click here to proceed
http://localhost:9090/comvivawebapp/

Page 2: GuestController
Welcome Guest
You are visitor number : 1

<a href="comviva">Go</a>

public class HelloController extends HttpServlet
{
	int counter;
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IO,Ser
	{
		counter++;
		response.setContentType("text/html");
		response.getWriter().println("<html>");
		response.getWriter().println("<body>");
		response.getWriter().println("<h2>Welcome Guest");
response.getWriter().println("<h2>You are visitor number : "+counter );

	}
}


** Lifecycle of servlet
----------------------------


init()
service(HttpServletRequest request,
			HttpServletResponse response)
	
destroy()




Use case : Present a web page to capture product details.
Next page : HTML

index.html ->GuestController	--> product.html



product.html

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0">
    <title>Document</title>
    <link type="text/css" href="styles.css" rel="stylesheet" />

</head>

<body bgcolor="yellow">
    <h2 class="btncenter highlight">Add Product</h2>
    <form action="saveProduct.html" method="get">
        <table cellspacing="10" border="0">
            <input type="hidden" name="gst" value="21">
            <input type="hidden" name="author" value="Tufail">
            <!-- Product Id-->
            <tr>
                <td><label id="productLabelId">Product Id </label></td>
                <td>
                    <input type="text" name="productId" id="productId" required pattern="^P[0-9][0-9][8]$">
                </td>
            </tr>

            <!-- Product Name-->
            <tr>
                <td><label id="productLabelName">Product Name </label></td>
                <td><input type="text" name="productName" id="productName"></td>
            </tr>
            <!-- QOH-->
            <tr>
                <td><label id="qohLabel">Quantity On Hand</label></td>
                <td><input type="text" id="quantityOnHand" name="quantityOnHand" max="1000"></td>
            </tr>

            <!-- QOH-->
            <tr>
                <td><label id="priceLabel">Price</label></td>
                <td><input type="number" id="price" name="price" min="0"></td>

            </tr>

            <tr>
                <td colspan="2" class="btncenter highlight"><input type="submit" value="Add">
                    <input type="submit" value="Update" formaction="updateProduct.html">
                    <input type="submit" value="Delete">
                </td>
            <tr>
            <tr>
                <td colspan="2" class="btncenter highlight"><input type="reset" value="Clear"></td>
            </tr>

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
        </table>
    </form>
</body>

</html>



styles.css

h2 {
    color: blue;
}

body {
    background-color: cadetblue;
}

table {
    border: 1px solid black;
    width: 100%;
    height: 50%;
    vertical-align: bottom;
    padding: 5px;
}



td.btncenter,h2.btncenter {
    text-align: center;
}

.highlight {
    background-color: rgb(100, 60, 0);
}





A:link {
    color: yellow
}

A:visited {
    color: blue;
}

A:hover {
    color: red;
}

div {
    width: 300px;
    border: 15px solid green;
    padding: 50px;
    margin: 20px;
}


input
{
    text-align: center;
    color: limegreen;
}

input#productId
{
    text-align: right;
    color: red;
}


Use case : Capture the product information and confirm from user

index.html ->GuestController	--> product.html --> ProductController.java
				P998
				Boat

			<Submit>





================
Hands on 








Upcoming topics
===============

RequestDispatcher


** Filtering is not a session mechanism method
Error code - 500




================









colors.html
===========


<html>
<body>
<form method="POST" action="ProcessForm">
Name: <input type="text" name="uname">
<p>Select Colors:<br>
<input type="checkbox" name="color" value=“Red"> 
Red <br> 
<input type="checkbox" name="color" value="Green"> Green<br>
<input type="checkbox" name="color" value="Blue">
Blue</p>
<p><input type="submit" value="Submit" name="B1">
<input type="reset" value="Reset" name="B2"></p>
</form>
</body>
</html>


Reference :
		String colors[] = request.getParameterValues("color");

	for(String s:colors) {
			response.getWriter().println("<h2>"+s);
		}


Get vs Post 

POST requests are never cached
POST requests do not remain in the browser history
POST requests cannot be bookmarked
POST requests have no restrictions on data length
POST requests data goes in body


<a href="ProcessForm">ProcessForm</a>


Additional Hands on :

Implement a basic calculator application by getting the two operands and one operator from the form in a textbox. 
Also have a button called result and when the same is clicked display the result. 

Only the result part of the page must change


=========================

RequestDispatcher


The RequestDispatcher interface provides the facility of dispatching the request to another resource it may be html, servlet or jsp. This interface can also be used to include the content of another resource also. It is one of the way of servlet collaboration.

There are two methods defined in the RequestDispatcher interface.


Methods of RequestDispatcher interface
The RequestDispatcher interface provides two methods. They are:

public void forward(ServletRequest request,ServletResponse response)throws ServletException,java.io.IOException:Forwards a request from a servlet to another resource (servlet, JSP file, or HTML file) on the server.
public void include(ServletRequest request,ServletResponse response)throws ServletException,java.io.IOException:Includes the content of a resource (servlet, JSP page, or HTML file) in the response.



GuestController.java

response.getWriter().println("<h2><a href=login.html>Login</a>");



login.html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .login-container {
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }

        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
        }

        input[type="text"]:focus, input[type="password"]:focus {
            border-color: #007bff;
            outline: none;
        }

        .btn-login {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            font-size: 16px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .btn-login:hover {
            background-color: #0056b3;
        }

        .forgot-password {
            text-align: center;
            margin-top: 10px;
        }

        .forgot-password a {
            text-decoration: none;
            color: #007bff;
        }

        .forgot-password a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <div class="login-container">
        <h2>Login</h2>
        <form action="LoginController" method="POST">
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit" class="btn-login">Login</button>
        </form>
        <div class="forgot-password">
            <a href="#">Forgot Password?</a>
        </div>
    </div>

</body>
</html>


LoginController.java











Session Mechanism
	Cookie 
 	Url-rewriting 
 	Hidden Form Fields
	HttpSession


Url-rewriting 
 Hidden Form Fields

login.html	--> LoginController		-->HomeController

				request.getParameter("username");

		<input type="hidden" name="username" value="ii">

Url-rewriting 

	<a href="HomeController?username=isha">


HttpSession 
==============

HttpServletRequest request

HttpSession session = request.getSession();	***
session.setAttribute("currentUser", username);



HttpSession session = request.getSession();
String temp = (String)session.getAttribute("currentUser");


session.invalidate();

Cookies
============

Use case : When a user visits our website for the first time, we want to greet 
Welcome first time visitor, but he/she visits again.

Welcome Anu,

Welcome Back Anu,


===============

ServletConfig	- same servlet data will be available.
ServletContext	- all the servlet data will be available.


web.xml - deployment descriptor


Filter concept
JSP
======

JSP --> Translates --> Servlet

Java Server Pages

-- Views

Implicit objects available in JSP

out
request
reponse
config
context
session


JSP implicit variables and Objects
---------------------------------------
request: An instance of HttpServletRequest
response: An instance of HttpServletResponse
out: An instance of JspWriter
session: An instance of HttpSession
config: An instance of ServletConfig
application: An instance of ServletContext
page: An instance of Object
pageContext: An instance of PageContext
exception: An instance of Throwable



Servlet - Logic
JSP - Views

Use case : 
login page --> 	check whether valid/invalid 	--> Display Homepage(lots of htmls/date time)

HTML		Servlet			--> JSP


<%	%>	- Scriplet
<%!	%>	- Declaration
<%= 	%>	- Expressions - print
<%-- 	%>	- JSP Comments




Create a JSP that displays 2 text boxes. Accept two numbers and print the addition, subtraction, multiplication and division of those numbers.
 ( 15 Mins)


Directives

JSP 
page directives
include directives
taglib directives



JSTL - Java Standard Tag Libraries
==========================

core tags - dont need scriplet to write java code




Display a JSP registration form that requests the user to enter user’s name, email id, city, phone number. 
On submitting the form, a servlet must validate the data. In case the data is invalid, the JSP page must be displayed again indicating the error fields. This time the registration form must be prefilled with the data that user has entered previously. 
If the data is valid, display "Congrats your details saved successfully"

** All fields are mandatory
** phone number should be 10 digits
** city should only be Bangalore and Gurgaon










login.jsp

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.login-container {
	background-color: #fff;
	padding: 30px;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	width: 300px;
}

h2 {
	text-align: center;
	color: #333;
}

.form-group {
	margin-bottom: 20px;
}

label {
	display: block;
	font-weight: bold;
	margin-bottom: 5px;
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 4px;
	font-size: 16px;
}

input[type="text"]:focus, input[type="password"]:focus {
	border-color: #007bff;
	outline: none;
}

.btn-login {
	width: 100%;
	padding: 10px;
	background-color: #007bff;
	color: white;
	font-size: 16px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.btn-login:hover {
	background-color: #0056b3;
}

.forgot-password {
	text-align: center;
	margin-top: 10px;
}

.forgot-password a {
	text-decoration: none;
	color: #007bff;
}

.forgot-password a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>


<% 
	String username = (String)session.getAttribute("uname");
	String errusername = (String)session.getAttribute("erruname");
	if(username==null)
		username="";
	if(errusername==null)
		errusername="";
	%>
	<div class="login-container">
		<h2>Login</h2>
		<form action="LoginController" method="POST">
			<div class="form-group">
				<label for="username">Username</label> <input type="text"
					id="username" name="username" value="<%= username %>"
					   >
					   <font color="red"><%= errusername %></font>
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					id="password" name="password" required>
			</div>
			<button type="submit" class="btn-login">Login</button>
			<input  type="submit" class="btn-login" formaction="print.jsp">Print</button>

		</form>
		<div class="forgot-password">
			<a href="#">Forgot Password?</a>
		</div>
	</div>

</body>
</html>



print.jsp

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	%>
	<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
	
<%@ include file="company.jsp" %>
<%@ page import="java.util.Date,java.util.*" %>
<!DOCTYPE html>
<html>
<body>
	<%
	for (int i = 1; i <= 3; i++) 
	{
	%>
		out.println(i);
	<%
	}
	%>
	<h2>Printing your name</h2>
	<%!int num1 = 100;
	String name = "Piyush";

	public String getMessage(int n1, int n2) {
		return n1 + n2 + "Hello Comviva";
	}%>

	<%=getMessage(12, 12)%>
	<%
	String un = request.getParameter("username");
	session.setAttribute("uname", un);
	if(un.length()==0)
		session.setAttribute("erruname", "Username is empty");
	else
		session.setAttribute("erruname", "");

	session.setAttribute("currentUser", un);
	

	for (int i = 1; i <= 5; i++) {
		out.println("<h2>" + un);
	}
	%>
	<c:redirect url="login.jsp"></c:redirect>
	<h2>Thanks for visiting my website</h2>
	<%
	out.println("<h2> Todays date is :" + new Date());
	%>
	<h2>
		<%
		out.println("Welcome " + name);
		%><br />
		<%="Welcome" + name%>
		<%="Num1 value is :" + num1%>
	</h2>
		
		

</body>
</html>












JSP lifecycle: Translation, compilation, execution
===================================

jspInit
jspService
jspDestroy

Stages of lifecycle


 Translation --> JSP --> Servlet
Servlet --> Compilation
Execution



Tag libraries in JSP: jsp:useBean, jsp:setProperty, jsp:getProperty
=============================================
Bean


Model class with setters and getters - Reusable class - Bean class

Use case : User should input product details and we need to print product details in the checkout page.


product.html	--> viewProduct.jsp			CheckoutController.java

			
Step 1:

Create Product.java

package com.training.comviva.model;

//Java Bean
public class Product {

	private int productId;
	private String productName;
	private int quantityOnHand;
	private int price;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int productId, String productName, int quantityOnHand, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
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


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + "]";
	}

}


Step 2: Create Product.html



<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=<device-width>, initial-scale=1.0">
<title>Document</title>
<link type="text/css" href="styles.css" rel="stylesheet" />

</head>

<body bgcolor="yellow">
	<h2 class="btncenter highlight">Add Product</h2>
	<form action="ProductController" method="get">
		<table cellspacing="10" border="0">
			<input type="hidden" name="gst" value="21">
			<input type="hidden" name="author" value="Tufail">
			<!-- Product Id-->
			<tr>
				<td><label id="productLabelId">Product Id </label></td>
				<td><input type="text" name="productId" id="productId" required>
				</td>
			</tr>

			<!-- Product Name-->
			<tr>
				<td><label id="productLabelName">Product Name </label></td>
				<td><input type="text" name="productName" id="productName"></td>
			</tr>
			<!-- QOH-->
			<tr>
				<td><label id="qohLabel">Quantity On Hand</label></td>
				<td><input type="text" id="quantityOnHand"
					name="quantityOnHand" max="1000"></td>
			</tr>

			<!-- QOH-->
			<tr>
				<td><label id="priceLabel">Price</label></td>
				<td><input type="number" id="price" name="price" min="0"></td>

			</tr>

			<tr>
				<td>
					<p>
						Select Colors:<br>
						 <input type="checkbox" name="color"
							value="Red"> Red <br> 
							<input type="checkbox"
							name="color" value="Green"> Green<br>
							 <input
							type="checkbox" name="color" value="Blue"> Blue
					</p>
				</td>
			</tr>
			<tr>
				<td colspan="2" class="btncenter highlight"><input
					type="submit" value="Add"> 
					<input type="submit"
					value="View" formaction="viewProduct.jsp"> <input
					type="submit" value="Delete"></td>
			<tr>
			<tr>
				<td colspan="2" class="btncenter highlight"><input type="reset"
					value="Clear"></td>
			</tr>

			<tr>
				<td rowspan="3" valign="top">Email</td>

			</tr>
			<tr>

			</tr>
			<tr>

				<td rowspan="3" valign="bottom">Official : rahul@dxc.com<br />
					Personal : rahul@gmail.com
				</td>
			</tr>
		</table>
	</form>
</body>

</html>


Step 3: create viewProduct.jsp 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean 
		id="product" 	
		scope="session" 
		class="com.training.comviva.model.Product" >

<jsp:setProperty property="productId" name="product" param="productId"/>

<jsp:setProperty property="productName" name="product" param="productName"/>
<jsp:setProperty property="quantityOnHand" name="product" param="quantityOnHand"/>
<jsp:setProperty property="price" name="product" param="price"/>

</jsp:useBean>

<h2>Your product is saved with Us.. Checkout for billing</h2>

<a href="CheckoutControlller">Checkout</a>
</body>
</html>



Step 4: Create CheckoutController.java

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		
		response.getWriter().println("<h2>Your selected product details are :");
		response.getWriter().println(session.getAttribute("product"));
	}








		Any questions ?












