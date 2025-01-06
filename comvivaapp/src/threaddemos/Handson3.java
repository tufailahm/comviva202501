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