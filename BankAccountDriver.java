package project2;

import java.util.Scanner;

public class BankAccountDriver {

	public static void main(String[] args) {
		String userName, userAccountID;
		Double userBalance, userFee;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Bank of Monopoly!");
		
		System.out.println("Enter your name: ");
		userName = scan.nextLine();
		
		System.out.println("Enter your account ID: ");
		userAccountID = scan.nextLine();
		
		System.out.println("Enter your initial balance: ");
		userBalance = Double.parseDouble(scan.nextLine());
		
		System.out.println("Enter the fee: ");
		userFee = Double.parseDouble(scan.nextLine());
		
		BankAccount user = new BankAccount(userName, userAccountID, userBalance);
		
		// print menu, and logic 
		boolean menu = true;
		while(menu) {
			System.out.println("Enter \"deposit\" or \"d\" to make a deposit.");
			System.out.println("Enter \"withdraw\" or \"w\" to make a withdrawal.");
			System.out.println("Enter \"balance\" or \"b\" to check the balance.");
			//System.out.println("Enter \"fee\" or \"f\" to apply the fee.");
			System.out.println("Enter \"quit\" or \"q\" to quit.");
			
			String option = (scan.nextLine()).toLowerCase();
			
			if(option.equals("deposit") || option.equals("d")) {
				System.out.println("Enter the deposit amount: $");
				double userDepositAmount = Double.parseDouble(scan.nextLine());
				user.deposit(userDepositAmount);
				System.out.println("Balance: $" + user.getBalance());
			} else if (option.equals("withdraw")  || option.equals("w")) {
				System.out.println("Enter the withdraw amount: $");
				double userWithdrawAmount = Double.parseDouble(scan.nextLine());
				user.withdrawl(userWithdrawAmount);
				System.out.println("Balance: $" + user.getBalance());
			} else if (option.equals("balance") || option.equals("b")) {
				System.out.println(user.toString());
			} else if (option.equals("fee") || option.equals("f")) {
				user.setBalance(user.getBalance() - userFee);
				System.out.println("Balance: $" + user.getBalance());
			} else if (option.equals("quit") || option.equals("q")) {
				menu = false;
				System.out.println("Goodbye!");
			} else {
				System.out.println("Sorry, I can't understand. Please type again.");
			}
		
		}
		
	}

}
