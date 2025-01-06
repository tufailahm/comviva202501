package collectiondemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {

	public Demo2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Set<String> coupons = new HashSet<String>();
		coupons.add("RENU");
		coupons.add("JAGSG");
		coupons.add("AAGSG");
		coupons.add("IPSHS");
		coupons.add("RAGSG");
		coupons.add("KAPOOR");
		System.out.println("Coupons is empty : " + coupons.isEmpty());
		System.out.println(coupons);
		
		System.out.println("All coupons - for each loop");
		for(String s:coupons)
		{
			System.out.println(s);
		}
		
		System.out.println("All coupons - except starting A");
		Iterator<String> iterator = coupons.iterator();
		while(iterator.hasNext()) {
			String temp = iterator.next();
			if(!temp.startsWith("A"))
			System.out.println(temp);
		
			
		}
		
	}
}
