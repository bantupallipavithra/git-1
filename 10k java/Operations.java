public class Operations
{
	public static void main(String[]args)
	{
		double a=10;
		double b=20;
		char operator='+';
		switch(operator)
		{
			case'+':System.out.println("Result:"+(a+b));
			break;
			case'-':System.out.println("Result:"+(a+b));
			break;
			case'*':System.out.println("Result:"+(a+b));
			break;
			case'/':System.out.println("Result:"+(a+b));
			if(b!=0)
			{
				System.out.println(a/b);
			}
			else
			{
				System.out.println("Error");
			}
			break;
		default:
			System.out.println("Invalid operator");
		}
	}
}