package BankAccount.com;

public class BankAccount {
	private String accountHolder;
	private int accountNumber;
	private double balance;
	public void setAccountDetails(String holder,int accNum,double b) {
		accountHolder=holder;
		accountNumber=accNum;
		balance=b;
	}
	public String getAccountDetails() {
		return "Account Holder:"+accountHolder+"\nAccount Number:"+accountNumber+"\nBalance:"+balance;
	}

}
