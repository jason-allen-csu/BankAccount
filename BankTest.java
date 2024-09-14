package JavaProgramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
    	
        boolean validInput = false;
        boolean validInput2 = false;
        
        //Bank Account Details
        while(!validInput) {
        	try {
                System.out.println("Enter First name:");
                String firstName = scnr.nextLine();
                
                System.out.println("Enter Last name:");
                String lastName = scnr.nextLine();
                
                System.out.println("Enter Account ID:");
                int accountID = scnr.nextInt();	
                scnr.nextLine();
                
                BankAccount bankAccount = new BankAccount(firstName,lastName,accountID);
            
                // Deposit to Bank Account
                System.out.println("Enter Amount to deposit:");
                double depositAmount = scnr.nextDouble();
                scnr.nextLine();
                bankAccount.deposit(depositAmount);
                
                // Withdraw from Bank Account
                System.out.println("Enter amount to withdraw:");
                double withdrawAmount = scnr.nextDouble();
                scnr.nextLine();
                bankAccount.withdraw(withdrawAmount);
                
                // Print Bank Account Summary
                bankAccount.accountSummary();
                validInput = true;
                
        	} catch (InputMismatchException e) {
        		System.out.println("Enter valid inputs.");
        		scnr.nextLine();
        	}
        }
        
        //Checking Account Details
        while(!validInput2) {
        	try {
        		System.out.println("\nEnter First name:");
                String CfirstName = scnr.nextLine();
                
                System.out.println("Enter Last name:");
                String ClastName = scnr.nextLine();
                
                System.out.println("Enter Account ID:");
                int CaccountID = scnr.nextInt();	
                scnr.nextLine();
                
                System.out.println("Enter interest rate:");
                double interestRate = scnr.nextDouble();
                scnr.nextLine();
                
                CheckingAccount checkingAccount = new CheckingAccount(CfirstName,ClastName,CaccountID,interestRate);
            
                // Deposit to Checking Account
                System.out.println("Enter Amount to deposit:");
                double CdepositAmount = scnr.nextDouble();
                scnr.nextLine();
                checkingAccount.deposit(CdepositAmount);
                
                // Withdraw from Checking Account
                System.out.println("Enter amount to withdraw:");
                double CwithdrawAmount = scnr.nextDouble();
                scnr.nextLine();
                checkingAccount.withdraw(CwithdrawAmount);
                
                // Print Checking Account Summary
                checkingAccount.displayAccount();
                validInput2 = true;
                
        	} catch (InputMismatchException e) {
        		System.out.println("Enter valid inputs.");
        		scnr.nextLine();
        	}
        }
    scnr.close();   
    } 
}