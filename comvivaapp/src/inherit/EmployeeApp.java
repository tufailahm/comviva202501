package inherit;

class Employee extends Object
{
	int employeeId;
	String employeeName;
	int salary=10000;
	public void markAttendance() {
		System.out.println("Employee Marked the attendance");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("FINALIZE CALLED");
	}
}
class PermanentEmployee extends Employee 
{
	int regularSalary;
	int salary=500000;
	public void allocateProject() {
		int salary=8000000;
		System.out.println(salary);
		System.out.println(this.salary);
		System.out.println(super.salary);
		System.out.println("Permanent Employee project allocated");
	}
}
class ContractEmployee extends Employee 
{
	int payPerHour;
	public void issueTemporaryPass() {
		System.out.println("Contract Employee pass issued");
	}
	public void markAttendance() {
		System.out.println("Contract employee attandance marked");
	}
}
public class EmployeeApp {
	public static void main(String[] args) {
		System.out.println("Way 1");
		//way 1
		PermanentEmployee obj1 = new PermanentEmployee();
		obj1.markAttendance();
		//obj1.allocateProject();
		ContractEmployee obj2 = new ContractEmployee();
		obj2.markAttendance();
		//obj2.issueTemporaryPass();
		
		//way 2
		System.out.println("Way 2");
		Employee e1 = new PermanentEmployee();
		e1.markAttendance();
		e1 = new ContractEmployee();
		e1.markAttendance();
		
		System.gc();  //calls the GC
	
	}
}