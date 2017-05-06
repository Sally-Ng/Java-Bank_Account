package project2;

public class BankAccount {

	// instance data variables
	private String name;
	private String accountID;
	private double balance;
	
	// constructor 
	public BankAccount(String initialName, String initialAccountID, double initalBalance) {
		name = initialName;
		accountID = initialAccountID;
		balance = initalBalance;
	}
	
	// getters 
	public String getName() {
		return name;
	}
	public String getAccountID() {
		return accountID;
	}
	public double getBalance() {
		return balance;
	}

	// setters
	public void setDescription(String newName) {
		name = newName; 
	}
	public void setNumberOfUnits(String newAccountID) {
		accountID = newAccountID;
	}
	public void setBalance(double newBalance) {
		if(newBalance >= 0) {
			balance = newBalance;
		} else {
			System.out.println("Price cannot be set to a negative number.");
		}
	}
	
	// toString- defines the text representation of an object
	public String toString() {
		String object = "Name: " + name + "\n" +
						"Account ID: " + accountID + "\n" +
						"Balance: $" + balance + "\n";						
		return object;	
	}
		
	// deposit method
	public double deposit(double depositAmount) {
		if (depositAmount < 0) {
			System.out.println("Deposit amount must be zero or greater.");
		} else {
			balance = balance + depositAmount;	
		}
		return balance;
	}
	
	// withdraw method
	public double withdrawl(double withdrawAmount) {
		if(withdrawAmount < 0) {
			System.out.println("Withdrawal amount must be zero or greater.");
		} else if (withdrawAmount >= balance) {
			System.out.println("Insufficient funds.");
		} else {
			balance = balance - withdrawAmount;
		}
		return balance;
	}
	
}
