public class Account{
	public static void main(String[]args){
		Boolean isHavingAccount=true;
		Boolean isLoggedIn=true;
		Boolean isPremium=true;
		if(isHavingAccount){
			if(isLoggedIn && isPremium){
			System.out.println("Watch Premium Content");
			}
			else if(isLoggedIn){
			System.out.println("Subscribe For Premium Content");
			}
			else{
			System.out.println("Invalid Credintials");
			}
		}
			else{
			System.out.println("create an account");
}
}
}