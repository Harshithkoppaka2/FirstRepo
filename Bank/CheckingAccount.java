package Bank;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(int Accno, int Balance) {
		super(Accno, Balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void deposit(int amount) {
		
		setBalance(amount+ getBalance());
		System.out.println("the deposit is successful");
		System.out.println("the current Balance is : " +  getBalance());
		
	}

	@Override
	void Withdrawl(int amount) {

		if(getBalance() - amount<0) {
			System.out.println("Entered amount is exceeding the limit");
		}
		else {
			System.out.println("The amount has been dispensed");
			System.out.println(" the current balance is :" + getBalance());
		}
		
	}

}
