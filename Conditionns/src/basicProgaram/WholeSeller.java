package basicProgaram;

public class WholeSeller {
	public static void main(String[] args) {
		double Netbill=Integer.parseInt(args[0]);
		if(Netbill>5000)
		{
			Netbill=Netbill-(Netbill*0.05);
			System.out.println("bill amount is"+Netbill);
			
		}
		else if(Netbill>=5000 && Netbill<10000 )
		{
			Netbill=Netbill-(Netbill*0.10);
			System.out.println("bill amount is"+Netbill);
			
		}
		else 
		{
			Netbill=Netbill-(Netbill*0.15);
			System.out.println("bill amount is"+Netbill);
			
		}
		
	}

}
