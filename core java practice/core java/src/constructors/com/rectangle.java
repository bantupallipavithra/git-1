package constructors.com;

public class rectangle {
	private int length;
	private int breadth;

	public rectangle() {
		this.length = 1;
		this.breadth = 1;
	}

	public rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int area() {
		return length * breadth;
	}

	public static void main(String[] args) {
		rectangle rect1 = new rectangle();
		rectangle rect2 = new rectangle(5, 3);
		System.out.println("Default rectangle area: " + rect1.area());
		System.out.println("Custom rectangle area: " + rect2.area());
	}
}