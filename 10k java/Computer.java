public class Computer{
	static String OS="Windows";
	String ram;
		public static void main(String[]args){
			Computer c1=new Computer();
			c1.ram="8GB";
			Computer c2=new Computer();
			c2.ram="16GB";
			System.out.println("OS :"+Computer.OS);
			System.out.println("Computer 1 RAM:"+c1.ram);
			System.out.println("Computer 2 RAM:"+c2.ram);
}
}