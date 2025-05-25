package constructors.com;

public class PersonDemo {
	
	String name;
	static int age;
	
	public PersonDemo(String name,int age) 
	{
		this.name=name;
		PersonDemo.age=age;
	}
	
	
	public static void main(String[] args)
	{
		PersonDemo obj=new PersonDemo("cherry",20);
		System.out.println(obj.name);//non-static are must use objs
		System.out.println(PersonDemo.age);//static properties can acess in three ways here there are
		
		System.out.println(age);
//		System.out.print(obj);
		
		
	}
//	public  String toString() {
//		return "namekjhjbjrbvhjrbv "+name ;
	
	
	
	
	
	
//
//	}
	
	

}
