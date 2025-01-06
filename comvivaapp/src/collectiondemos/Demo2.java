package collectiondemos;
import java.util.*;


public class Demo2 
{
	int p=100;
	{
		
		System.out.println("3. A");
	}
	static 
	{
		System.out.println("1..... COMVIVA STATIC BLOCK");
	}
	public Demo2() {
		System.out.println("4. B");
	}
	public void display() {
		System.out.println("5. C");
	}
	public static void main(String[] args)
	{  
			System.out.println("2.  D");
			Demo2 d = new Demo2();
			d.display();
			
			Map<String,Integer> dd = new LinkedHashMap<String,Integer>();    
			
			dd.put("One", new Integer(1)); 
			dd.put("Two", new Integer(2));
			
			Object obj = dd.get("One");   
			System.out.println(obj);
			
			System.out.println(dd); 
			
			HashMap hs = new HashMap();
			hs.put("1","Tufail");
			hs.put("1", "Tarun");
			
			System.out.println(hs);
			
	}
}
