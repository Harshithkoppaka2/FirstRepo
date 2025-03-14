package Bank;

public abstract class BankAccount {
	
	
	private int Accno;
	private int Balance;
	
	
	public int getAccno() {
		return Accno;
	}


	public void setAccno(int accno) {
		Accno = accno;
	}


	public int getBalance() {
		return Balance;
	}


	public void setBalance(int balance) {
		Balance = balance;
	}


	public BankAccount(int Accno,int Balance) {
		this.Accno = Accno;
		this.Balance = Balance;
		
	}
	
	 abstract void deposit(int amount);
	 
	 abstract void Withdrawl(int amount);
	 
	 void CheckBalance() {
		 System.out.println("The current balance for Account No :"+ Accno+ " is :" + Balance);
	 }
	
	 

}
