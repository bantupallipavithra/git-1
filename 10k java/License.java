public class License{
	public static void main(String[]args){
		int age=18;
		Boolean isHavingLicense=true;
		if(age>=18){
			if(isHavingLicense){
				System.out.println("Verification Success");
			}
			else {
				System.out.println("Verification Failed");	
			}
		}else{
			System.out.println("Still Minor or Invalid Age");
			}
				
		
	}
}