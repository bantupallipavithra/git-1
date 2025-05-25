public class Patient{
	public String printDetails(String hospitalname, String patientname, int age){
	return "Hospital name: "+ hospitalname +"\nPatient Name: "+patientname + "\nPatient Age:" +age;	
}
	public static void main (String[]args){
		Patient cherry=new Patient();
		String details1=cherry.printDetails("city care hospital","john doe",45);
		String details2=cherry.printDetails("city care hospital","emma watson",30);
		System.out.println(details1);
		System.out.println(details2);

}
}