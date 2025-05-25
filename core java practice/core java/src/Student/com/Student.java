package Student.com;

public class Student {
	private String name;
	private int rollNumber;
	private double percentage;
	public void setStudentDetails(String nm,int roll,double perc) {
		name=nm;
		rollNumber=roll;
		percentage=perc;
	}
	public String getStudentDetails() {
		return "Student Name is:"+name+"\nStudent Roll Number:"+rollNumber+"\nStudent Percentage:"+percentage;
	}

}
