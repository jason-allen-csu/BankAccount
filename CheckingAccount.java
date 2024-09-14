package JavaProgramming;

// Subclass
class CheckingAccount extends BankAccount {
	// Declaring checking account attributes
	private double interestRate;
	private double OverdraftFee = 30.0;
	
	// Constructor
	public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
		super(firstName, lastName, accountID);
		this.interestRate = interestRate;
	}

	// Getter and setter for interest rate
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	// Method to withdraw
	@Override
	public void withdraw (double withdrawAmount) {
		if (withdrawAmount > 0 && withdrawAmount <= balance) {
				balance = balance - withdrawAmount;
				System.out.println("Amount withdrawn sucessfully.");
		}
		else if (withdrawAmount > balance) {
				processWithdrawal(withdrawAmount);
		}
		else {
				System.out.println("Invalid withdrawal amount.");
		}			
	}
	
	// Method to calculate overdraft 
	public void processWithdrawal(double withdrawAmount) {
			balance = getBalance() - withdrawAmount - OverdraftFee;
			System.out.println("\nOverdraft fee of $" +OverdraftFee +" was deducted.");
			System.out.println("Account balance :" +balance);
	}
	
	// Method to display checking account details
	public void displayAccount() {
		super.accountSummary();
		System.out.println("Interest Rate :" +interestRate +"%");
	}
	
}
