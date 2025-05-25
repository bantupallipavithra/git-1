public class Person1{
	public String getDetails(String name ,String address, String no){
	return "my name is "+name +"\nmy address is "+address + "\nmy no is " +no;	
}
	
		public static void main (String[]args){
		Person1 cherry=new Person1();
		String details=cherry.getDetails("pavithra","hyd","1234");
		System.out.println(details);
}
}