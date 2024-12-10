package basicProgaram;

public class FindDaysMonthYear {
	public static void main(String[] args) {
		int Day=Integer.parseInt(args[0]);//366
		int Year=Day/365;
		int rem=Day%365;
		int Month=rem/30;
		int d=rem%30;
		System.out.println("Year ="+Year +"\n Month ="+Month +"\n days="+d);
		
		
		
	}

}
