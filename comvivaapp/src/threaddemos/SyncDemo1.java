package threaddemos;

//shared resource
class TwoStrings
{
	static synchronized void  print(String str1, String str2)  //locked
	{
		System.out.print(str1);
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException ie)
		{
		}
		System.out.println(str2);
	}
}

class PrintStringsThread implements Runnable
{
	Thread thread;
	String str1, str2;
	PrintStringsThread(String str1, String str2)
	{
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();
	}
	public void run()
	{
		TwoStrings.print(str1, str2);
	}
}
public class SyncDemo1
{
	public static void main(String args[])
	{
		new PrintStringsThread("Neha  ", "Kapoor");
		new PrintStringsThread("Tarun  ", "Sinha");
		new PrintStringsThread("Karthik   ","Aryan");
	}
}