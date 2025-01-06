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
