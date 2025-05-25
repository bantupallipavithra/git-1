package encapsulation.com;

public class LoanApplication {
	private String customerName;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double outStandingBalance;
	public LoanApplication(String customerName,double loanAmount,double interestRate,int loanTerm) {
		this.customerName=customerName;
		this.loanAmount=loanAmount;
		this.interestRate=interestRate;
		this.loanTerm=loanTerm;
		this.outStandingBalance=loanAmount;
		System.out.println("Loan Application Submitted");
	}
	public String getCustomerName() {
		return customerName;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public double getOutStandingBalance() {
		return outStandingBalance;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount=loanAmount;
	}
	public void setInterestrate(double interestRate) {
		this.interestRate=interestRate;
	}
	public void setloanTerm(int loanTerm) {
		this.loanTerm=loanTerm;
	}
	public void setOutStandingBalance(double outStandingBalance) {
		this.outStandingBalance=outStandingBalance;
	}
	public void makePayment(double amount) {
		if(amount<=0) {
			System.out.println("invalid payment amount");
		}
		else if(outStandingBalance>amount) {
			System.out.println("Exceeds the balance");
		}
		else {
			outStandingBalance-=amount;
		}
	}
	public double calculateEMI() {
		double monthlyRate=interestRate/(12*100);
		int totalMonths=loanTerm*12;
		if(monthlyRate==0) {
			return loanAmount/totalMonths;
		}
		double emi= (loanAmount*interestRate*Math.pow((1+interestRate),10))/(Math.pow((1+interestRate),10)-1);
		return emi;
	}
	
	public void displayLoanDetails() {
		double emi=calculateEMI();
		System.out.println("customer Name:"+customerName);
		System.out.println("Total Loan Amount"+loanAmount);
		System.out.println("Interest Rate:"+interestRate);
		System.out.println("Loan Term:"+loanTerm);
		System.out.printf("Monthly EMI:",emi);
		System.out.println("Outstanding Balance:"+outStandingBalance);
	}
	public static void main(String[] args) {
		LoanApplication obj=new LoanApplication("pavi",500000,2,2);
		obj.displayLoanDetails();
		obj.makePayment(10000);
		
	}
}

