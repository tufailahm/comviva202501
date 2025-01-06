package threaddemos;

public class Music implements Runnable {

	public static void main(String[] args) {
		Music m = new Music();
		Thread t1 = new Thread(m);
		t1.start();
		t1.interrupt();
		System.out.println(t1.getState());
		System.out.println(t1.isInterrupted());
		System.out.println(t1.getState());
		System.out.println(t1.isInterrupted());
	}
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("RUN CALLED BY :" + Thread.currentThread().getName());
			
		}
	}
}
