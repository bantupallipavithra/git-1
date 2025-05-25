package constructors.com;

public class Product {
	int id;
	double price;
	public Product(int id,double price) {
		this.id=id;
		this.price=price;
	}
	 public boolean isSame(Product p) {
		return this.id==p.id;
	}
	 public void test() {
		 System.out.println("id:"+id+"\nprice:");
	 }
	 public static void main(String[] args) {
		Product p1=new Product(101,50000);
		Product p2=new Product(102,40000);
		if(p1.isSame(p2)) {
			System.out.println("Product have the same id");
		}
		else {
			System.out.println("Products have different ids");
		}
	}

}
