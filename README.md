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















