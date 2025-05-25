public class Department{
	static String departmentName="HR";
	String employeeName;
	public static void main(String[]args){
		System.out.println("Department:"+departmentName);
		Department e1=new Department();
		e1.employeeName="john";
		Department e2=new Department();
		e2.employeeName="alice";
		System.out.println("Employee 1:"+e1.employeeName);
		System.out.println("Employee 2:"+e2.employeeName);
		Department.departmentName="marketing";

		System.out.println("After modifications");


		System.out.println("Department:"+Department.departmentName);
		System.out.println("Employee 1:"+e1.employeeName);
		System.out.println("Employee 2:"+e2.employeeName);

}
}