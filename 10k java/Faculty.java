public class Faculty{
	public String showFacultyDetails(String universityname, String facultyname, String department){
	return "University name: "+ universityname +"\nFaculty Name: "+facultyname + "\nDepartment:" +department;	
}
	public static void main (String[]args){
		Faculty cherry=new Faculty();
		String details1=cherry.showFacultyDetails("Standard University","Dr.Robert Brown","computer science");
		String details2=cherry.showFacultyDetails("Standard University","Dr.lisa Green","physics");
		System.out.println(details1);
		System.out.println(details2);

}
}