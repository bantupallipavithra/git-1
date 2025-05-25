public class Mobile{
	public String showDetails(String storename, String brand, String price){
	return "Store name: "+storename +"\nMobile brand: "+brand + "\nMobile Price:" +price;	
}
	public static void main (String[]args){
		Mobile cherry=new Mobile();
		String details1=cherry.showDetails("Tech World","Apple","1200");
		String details2=cherry.showDetails("Tech World","samsung","900");
		System.out.println(details1);
		System.out.println(details2);

}
}