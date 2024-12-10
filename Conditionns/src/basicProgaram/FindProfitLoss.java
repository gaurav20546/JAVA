package basicProgaram;

public class FindProfitLoss {
	public static void main(String[] args) {
		double sell=Double.parseDouble(args[0]);
		double cost=Double.parseDouble(args[1]);
		if(sell>cost)
		{
			double profit=sell-cost;
			double Profitper=(profit/cost)*100;
			System.out.println( "selleng ="+sell +"\ncost "+cost +"\nprofit ="+profit);
			System.out.println("Profit percentage"+Profitper);
		}
		else if (sell<cost)
		{
			double loss=cost-sell;
			double losstper=(loss/cost)*100;
			System.out.println("selleng ="+sell +"\ncost "+cost +"\nLoss ="+loss);
			System.out.println("loss percentage"+losstper);
		}
		else 
		{
			System.out.println("bharagav all are same");
		}
		
		
				
		
		
		
		
		/*double profit=sell-cost;
		double loss=cost-sell;
		System.out.println("profit ="+profit);
		System.out.println("Loss ="+loss);
		double Profitper=(profit/cost)*100;
		double losstper=(loss/cost)*100;
		System.out.println("Profit percentage"+Profitper);
		System.out.println("loss percentage"+losstper);*/		
		
	}

}
