package exceptiondemo;

public class DemoThrows {
	public void display1() throws InterruptedException {
		System.out.println("Display 1 started");
		Thread.sleep(10000);
		System.out.println("Display 1 ended");
	}
	public void display2() throws InterruptedException {
		System.out.println("Display 2 started");
		Thread.sleep(10000);
		System.out.println("Display 2 ended");
	}
	public void anotherMethod() {
		DemoThrows d1 = new DemoThrows();
		try {
			d1.display1();
			d1.display2();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DemoThrows d1 = new DemoThrows();
		d1.anotherMethod();
	}
}
