public class Car{
	static String companyName="Honda";
	String carModel="Civic";
	public static void main(String[]args){
		System.out.println("company:"+Car.companyName);
		Car car1=new Car();
		Car car2=new Car();
		car2.carModel="Accord";
		System.out.println("Car 1 model:"+car1.carModel);
		System.out.println("Car 2 model:"+car2.carModel);
}
}
