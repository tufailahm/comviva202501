package exceptiondemo;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("1. Hi");

		try {
			Thread.sleep(1000);
			System.out.println("2. Hello");
			System.out.println(20 / 5);
			System.out.println("Done");
			int num[] = new int[5];
			System.out.println(num[8]);
			System.out.println("Comviva");
		} catch (ArithmeticException e) {
			System.out.println("3. ERROR OCCURRED " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("3. ERROR OCCURRED " + e);
		} catch (Exception e) {
			System.out.println("3. ERROR OCCURRED " + e);
		}
		finally {
			//Database closing operations
			//file close
			System.out.println("FINALLY CALLED");
		}
		System.out.println("4. Bye");
	}
}
