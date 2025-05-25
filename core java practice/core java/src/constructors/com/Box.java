package constructors.com;

public class Box {
	int length;
	public Box(int length) {
		this.length=length;
		}
	Box setLength(int length) {
		this.length=length;
		return this;
	}
	void display() {
		System.out.println("Length:"+length);
	}
	public static void main(String[] args) {
		Box box=new Box(5);
		box.setLength(10).display();
	}
	

}
