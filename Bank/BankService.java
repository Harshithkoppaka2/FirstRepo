package Bank;

import java.util.*;

public class BankService {
	Scanner s  = new Scanner(System.in) ;
	ArrayList <BankAccount> Accounts  = new ArrayList();  
	
	public void CreateAccount() {
		System.out.println("Enter your choice");
		System.out.println(" 1.Savings Account ");
		System.out.println(" 2.Checking Acccount");
		
		int type = s.nextInt();
		
			System.out.println(" Enter your Account number");
			int AccNo = s.nextInt();
			System.out.println(" Enter your Initial deposit");
			int amount = s.nextInt();
		
	        BankAccount account = null; // Polymorphic reference

			
			if(type == 1) {

			 account  = new SavingsAccount(AccNo, amount);
			
			System.out.println(" New Savings account has been created ");
		}
			else if(type == 2) {
				 account  = new CheckingAccount(AccNo, amount);
				System.out.println(" New Checking account has been created ");

			}
			
			else {
				System.out.println("Invalid option");
				return;
			}
			
			Accounts.add(account);
	}
	
	
	public void Deposit() {
		
		
		System.out.println(" Enter your Account Number");
		
		int AccNo = s.nextInt();
		
		BankAccount account = FindAccount(AccNo);
		
		if(account != null) {
			System.out.println("enter the amount to be deposited");
			int amount = s.nextInt();
		
			account.deposit(amount);
			
			
		}
		else {
			System.out.println("Account not found");
		}
		
		
		
		}
	
	public void  Withdraw() {
		System.out.println("enter the account number");
		int AccNo = s.nextInt();
		BankAccount account  = FindAccount(AccNo);
		if(account!= null) {
			System.out.println(" enter the amout to withdraw");
			
			int amount = s.nextInt();
			account.Withdrawl(amount);
		}
		else {
			System.out.println("Account not found");
		}
	}
	
	public void CheckBalance() {
		System.out.println("enter the account number");
		int AccNo = s.nextInt();
		BankAccount account  = FindAccount(AccNo);
		if(account!= null) {
			
			account.CheckBalance();
		}
		else {
			System.out.println("Account not found");
		}
		
		
	}
	
	
	public BankAccount FindAccount(int AccNo) {
		
		for(BankAccount acc: Accounts) {
			if(acc.getAccno() == AccNo) {
				return acc;
			}
		}
		
		return null;
	}
	
	
	
}
