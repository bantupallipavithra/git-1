package constructors.com;

public class Employee1 {
	String name;
	double salary;
	public Employee1(String name,double salary) {
	this.name=name;
	this.salary=salary;
	}
	public void setSalary(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	public void display() {
		System.out.println("Name:"+name+"\nSalary:"+salary);
	}
	public static void main(String[] args) {
		System.out.println("Before modifications:");
		Employee1 obj1=new Employee1("pavi",123456);
		 obj1.display();
		 System.out.println("after modifications:");
			obj1.setSalary("navya",876543);
			 obj1.display();
			 
	}
}
