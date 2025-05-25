package Student.com;

public class StudentMain {
	public static void main(String[] args) {
		Student stu=new Student();
		stu.setStudentDetails("cherry", 302, 75);
		String result=stu.getStudentDetails();
		System.out.println(result);
	}

}
