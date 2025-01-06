package collectiondemos;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Demo1 {

	public Demo1() {
		
	}

	public static void main(String[] args) {
		List<String> names = new Vector<String>();

		names.add("Tarun");
		names.add("Kapoor");
		names.add("Richard");
		names.add("Anu");
		names.add("Ahmed");

		names.remove("Anu");
		System.out.println(names.size());
		System.out.println(names.contains("Daniel"));
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);

		
		
	}
}
