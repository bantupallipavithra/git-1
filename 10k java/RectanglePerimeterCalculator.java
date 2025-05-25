public class RectanglePerimeterCalculator{
	public static void calculatePerimeter(double length,double breadth){
		System.out.print("Perimeter:");
		System.out.println(2*(length+breadth));
}
	public static void main(String[] args){
		calculatePerimeter(5.0,3.0);
}
}