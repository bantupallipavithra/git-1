public class Score{
	public static void main(String[]args){
		int score = 89;
		
		if(score >= 90)
			System.out.println("A grade");
		else if(score >= 80 && score <= 89)
			System.out.println("B grade");			
		else if(score >= 70 && score <= 79)
			System.out.println("C grade");
		else if(score >= 60 && score <= 69)
			System.out.println("D grade");
		else
			System.out.println("F grade");

}
}