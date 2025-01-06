package threaddemos;

public class Games extends Thread {

	public Games() {
	}
	@Override
	public void run() {
		System.out.println("RUN CALLED BY :"+
					Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Thread m = Thread.currentThread();
		m.setName("COMVIVAGAMES");
		m.setPriority(MIN_PRIORITY);
		Games games1 = new Games();
		games1.setPriority(MAX_PRIORITY);
		games1.setName("SCORE");
		games1.start();
		System.out.println("MAIN CALLED BY :"+Thread.currentThread().getName());

	}
}
