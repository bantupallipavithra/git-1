public class Time{
	public static void main(String[]args){
		int time = 2;

			if(time >= 0 && time <= 4)
				System.out.println("Mid Night");
			else if(time >= 5 && time <= 11)
				System.out.println("Good Morning");
			else if(time >= 12 && time <= 16)
				System.out.println("Good Afternoon");
			else if(time >= 17 && time <= 20)
				System.out.println("Good Evening");
			else if(time >= 21 && time <= 24)
				System.out.println("Good Night");
			else
				System.out.println("Invalid time");
}
}