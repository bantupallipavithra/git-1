package user.mainclass;

//import maths.Adding;
//import maths.Subtarct;
import maths.*;

public class MainMethod {
	
	
	
	

	public static void main(String[] args)
	{
		Adding addobj=new Adding();//obj craetion
		
		System.out.println(addobj.add(10, 20));// calling   // add(10,20)==30 // now printing
		
		addobj.demo();
		
		
		Adding.staticdemo();// while calling static method from other package ,we must need to use classname.method() or else we will get error
		Subtarct.staticdemo();// calling method from subtacrt class
		
		Subtarct subobj=new Subtarct();
		
		System.out.println(subobj.sub(20, 10));
		
	}

}

