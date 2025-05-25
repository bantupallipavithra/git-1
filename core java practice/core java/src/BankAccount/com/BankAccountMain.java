package BankAccount.com;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount bc=new BankAccount();
		bc.setAccountDetails("cherry",1234567,5000.0);
		String result=bc.getAccountDetails();
		System.out.println(result);
	}

}
