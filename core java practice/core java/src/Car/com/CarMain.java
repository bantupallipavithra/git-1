package Car.com;

public class CarMain {
	public static void main(String[] args) {
		Car car=new Car();
		car.setCarDetails("Swift","Maruti",6000000.0);
		String result=car.getCarDetails();
		System.out.println(result);
}

}
