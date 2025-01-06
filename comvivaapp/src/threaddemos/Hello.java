package threaddemos;
public class Hello extends Thread{
	Thread t1;
	public Hello() {
		t1 = new Thread(this);
		t1.setPriority(MAX_PRIORITY);
		t1.start();
		System.out.println("COMVIVA :: "+ Thread.currentThread().getName());
	}
	@Override
	public void run() 
	{
		System.out.println("RUN CALLED BY :: "+ Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println("Good morning :: "+ Thread.currentThread().getName());
	}
}