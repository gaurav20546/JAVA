package basicProgaram;

public class SellingPrice {
	public static void main(String [] args)
	{
		double Tv=32500;
		double Pro=(Tv*27)/100;
		double Sell=Tv+Pro;
		System.out.println("Profiit is "+Pro);
		double Vat=(Sell*12.7)/100;
		double SrCha=(Sell*3.87)/100;	
		System.out.println("Total Selling price= "+(Sell+Vat+SrCha));
	}

	}

