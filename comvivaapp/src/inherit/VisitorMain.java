package inherit;

public class VisitorMain {

	public static void main(String[] args) {
		
		Visitor visitor1 = new Visitor(19191,"Tufail","Training","Pursottam");
		Visitor visitor2 = new Visitor(19192,"Neha","Meeting");
		Visitor visitor3 =new Visitor(19193,"Tarun","Interview");
		visitor2.setContactPerson(visitor1.getContactPerson());
		visitor3.setContactPerson(visitor1.getContactPerson());
		visitor1.setTime(9);
		System.out.println(visitor1);
		System.out.println(visitor2);
		System.out.println(visitor3);
		Visitor visitor4 = visitor1;
		System.out.println(visitor1==visitor4);			//true
		System.out.println(visitor1.equals(visitor4));	//true
		
		Visitor visitor5 = new Visitor(19191,"Tufail","Training","Pursottam");
		visitor5.setTime(9);

		System.out.println(visitor1==visitor5);				//false
		System.out.println(visitor1.equals(visitor5));		//true

	}
}
