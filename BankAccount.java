package JavaProgramming;

// Superclass
class BankAccount {
	// Declaring account attributes
	public String firstName;
	public String lastName;
	public int accountID;
	public double balance;
	
	// Constructor
	public BankAccount(String firstName, String lastName, int accountID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = 0.0;
	}
	
	// Getter and Setter for attributes
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAccountID() {
		return accountID;
	}
	
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// Method for depositing amount
	public void deposit (double depositAmount) {
		if (depositAmount > 0) {
			balance = balance + depositAmount ;
		}
		else {
			System.out.println("\nDeposit amount cannot be 0 or negative.");
		}
	}
	
	// Method for withdrawing amount
	public void withdraw (double withdrawAmount) {
		if (withdrawAmount > 0 && withdrawAmount <= balance) {
			balance = balance - withdrawAmount;
		}
		else {
			System.out.println("Invalid withdrawal amount.");
		}
	} 
	
	// Method for displaying account summary
	public void accountSummary() {
		System.out.println("\nAccount Summary");
		System.out.println("First Name :" +firstName);
		System.out.println("Last Name :" +lastName);
		System.out.println("Account ID :" +accountID);
		System.out.println("Account Balance : $" +balance);
	}
}