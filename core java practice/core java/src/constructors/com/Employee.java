package constructors.com;


	public class Employee {
		String name;
		double salary;

		public Employee(String name, double salary) {
			this.name=name;
			this.salary=salary;
			if(salary<0) {
				salary=0;
			}
	}
		public void displaydetails() {
			System.out.println("name:"+name);
			System.out.println(" salary:"+salary);
			
			
		}
		public static void main(String[] args) {
			Employee employee = new Employee("cherry", 2000);
		   employee.displaydetails();
			
}
	}
