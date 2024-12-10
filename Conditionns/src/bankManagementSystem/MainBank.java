package bankManagementSystem;

public class MainBank {
	
	public static void main(String[] args) {
		
		BankSystem b=new BankSystem();
		ATM atm=new ATM();
		atm.login(b);
		atm.showMenu();
		
		
	}

}
