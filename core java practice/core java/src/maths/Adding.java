package maths;

public class Adding {
	
	public int add( int a ,int b)//method defination
	{
		System.out.println("Adding class inside math package "+(a+b) );
		return a+b;
	}
	
	public void  demo()
	{
		System.out.println("demo method inside Adding class");
	}
	
	public static void staticdemo()
	{
		System.out.println("staticdemo method inside Adding class");  //it is a static method so we need no to craete obj while calling
	}

}
