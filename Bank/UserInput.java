package Bank;
import java.util.*;


public class UserInput {
	
	
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		BankService service  = new BankService();
		
		Boolean running = true;
		
		while(running) {
			
		
		System.out.println(" Weclome to Bank of America");
		System.out.println("Choose your desired option ");
		System.out.println("1.Create new Bank Account");
		System.out.println("2.Deposit cash");
		System.out.println("3.Withdraw Cash");
		System.out.println("4.Check the Balance");
		int choice = s.nextInt();
		s.nextLine();
		
		switch(choice) {
		case 1:
			service.CreateAccount();
			break;
			
		case 2:
			service.Deposit();
			break;
			
		case 3:
			service.Withdraw();
			break;
			
		case 4: 
			service.CheckBalance();
			break;
		}
		
		}
		
        
		
    }
	

}
