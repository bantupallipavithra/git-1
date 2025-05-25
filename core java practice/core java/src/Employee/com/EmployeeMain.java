package Employee.com;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setEmployeeDetails("cherry", "software developer",50000);
		String res=obj.getEmployeeDetails();
		System.out.println(res);
	}

}
