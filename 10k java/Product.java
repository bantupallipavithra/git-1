public class Product{
	static String category="Electronics";
	String productName;
	public static void main(String[]args){
		System.out.println("Category :"+Product.category);
		Product p1=new Product();
		Product p2=new Product();
		p1.productName="Laptop";
		p2.productName="SmartPhone";
		System.out.println("Product 1:"+p1.productName);
		System.out.println("Product 2:"+p2.productName);

}
	
}