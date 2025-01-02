package comvivaapp;

public class ArrayDemo {

	int marks = 90;
	float grade = (float) 67.7;
	byte rate = 125;
	int i;

	public void display() {
		System.out.println("Default value of integer is :" + i);
	}

	public static void main(String[] args) {
		/*
		 * Hands on : 10 minutes
		 * 
		 * Print default values of all primitive data types
		 */
		ArrayDemo demo = new ArrayDemo();
		demo.display();

		String names[] = { "A", "B", "C", "D" };

		// enhanced for loop
		for (String temp : names) {
			System.out.println(temp);
		}

		byte b1 = 10;
		byte b2 = 20;
		int b3 = b1 + b2;

		float f = 1 / 3;
		// int i = 1 / 3;
		float f1 = 1.01f;

		long b11 = 10;
		long b22 = 20;
		long b33 = b11 + b22;
	}
}
