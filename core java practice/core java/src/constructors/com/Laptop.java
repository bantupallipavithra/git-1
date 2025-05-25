package constructors.com;
public class Laptop {
	String brand;
	int ramsize;
	public Laptop(String brand,int ramsize) {
		this.brand=brand;
		this.ramsize=ramsize;
	}
	
	public void showSpecs() {
		System.out.println("laptop brand:"+brand+ ",laptop ramsize:"+ramsize);
		
	}
	public static void main(String[] args) {
		Laptop laptop1=new Laptop("hp",8);
		Laptop laptop2=new Laptop("lenovo",16);
		System.out.println("Laptop 1:");
		laptop1.showSpecs();
		System.out.println("laptop 2:");
		laptop2.showSpecs();
	}
}