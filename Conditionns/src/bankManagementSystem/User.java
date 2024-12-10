package bankManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String UserId;
	private String Userpin;
	private double balence;
	private List<String>transactionHistory;
	
	
	User(String userId,String Userpin,double balence)
	{
		this.UserId=userId;
		this.Userpin=Userpin;
		this.balence=balence;
		this.transactionHistory=new ArrayList<>();
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		this.UserId = userId;
	}

	public String getUserpin() {
		return Userpin;
	}

	public void setUserpin(String userpin) {
		this.Userpin = userpin;
	}

	public double getBalence() {
		return balence;
	}

	public void setBalence(double balence) {
		this.balence = balence;
	}

	public void updateBalence(double amount)
	{
		this.balence=balence+amount;
	}
	public void Addtranscation(String transaction)
	{
		transactionHistory.add(transaction);
	}
	public void showTransaction()
	{
		System.out.println("Transction History :");
		if(transactionHistory.isEmpty())
		{
			System.out.println("No Transction found :");
		}
		else {
			for(String t:transactionHistory)
			{
				System.out.println(t);
			}
		}
	}
	

}
