package bankManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class BankSystem {
	private Map<String,User>userDatabase;
	
	public BankSystem()
	{
		userDatabase =new HashMap<>();
		userDatabase.put("Gaurav", new User("Gaurav","1056",1000.00));
		userDatabase.put("raju", new User("raju","1057",50000.00));
	}

	public User validateUser(String userId, String userPin) {
		User user=userDatabase.get(userId);
		if(user !=null && user.getUserpin().equals(userPin))
		{
			return user;
		}
		return null;
		
	}
	

}

