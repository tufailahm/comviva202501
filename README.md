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

Java is an Object Oriented Programming language. It was picked up by Oracle, that develops 1 common implementation of the JRE and JDK, and through their (and others) efforts, Java has become very widely used.

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

JDK contains the JRE, as well as many different developer tools, such as the compiler or the archiver.

JRE contains the JVM as well as supporting libraries that the JVM needs to function.

The Java Compiler is the executable that produces Java ByteCode from Java Source Code (From .java to .class)

The JVM (along with the libraries from the JRE) executes the Java ByteCode.


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

<br/>
===========================================
Hands on:
	Create a new project named zooapp in which create a package named org.animals. In that create various classes like Lion, Monkey, Elephant. In each class create data members like color, weight and age. Create methods like isVegetarian, canClimb, getSound.
	Create another package called zoo and create a class called VandalurZoo and create objects for the animals that are existing in zoo and print the characteristic of each animal.

Recommended duration: 20 Mins



























