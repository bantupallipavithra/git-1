package Employee.com;

public class Employee {
	private String employeeName;
	private String designation;
	private double salary;
	public void setEmployeeDetails(String name,String desg,double sal) {
		employeeName=name;
		designation=desg;
		salary=sal;
	}
	public String getEmployeeDetails() {
		return "Employee Name:"+employeeName +"\nDesignation: "+designation +"\nSalary: "+salary;
	}
}
