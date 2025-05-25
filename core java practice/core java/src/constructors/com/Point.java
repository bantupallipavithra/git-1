package constructors.com;

public class Point {
	int X;
	int Y;
	public Point(int X,int Y) {
		this.X=X;
		this.Y=Y;
	}
	public void print() {
		System.out.println("X:"+X+"\nY:"+Y);
		System.out.println("current object reference:"+this);
	}
	public static void main(String[] args) {
		Point point1=new Point(10,20);
		point1.print();
	}

}
