package OOP_Day_14;

public class Bowler_BLC {
	
	private String Name;
	private int Wicket;
	private int Matches;
	private int balls_bowled ;
	private int run_conceded;
	double ave;
	
	public void bowlerDetails(String Name,int Wicket,int Matches,int balls_bowled ,int run_conceded )
	{
		
		this.Name=Name;
		this.Wicket=Wicket;
		this.Matches=Matches;
		this.balls_bowled=balls_bowled;
		this.run_conceded=run_conceded;

	}
	
	public void computeBowlingAverage(int Wicket )
	{
		
		if(Wicket<0 || Matches <0 || balls_bowled <0 || run_conceded <0 )
		{
			System.out.println("Error");
		}
			
		else if(run_conceded>0 && balls_bowled>0 && Matches==0){
		System.out.println("Error");
		
		}else
		{
			System.out.println("Name="+Name);
			this.ave=run_conceded/Wicket;
			System.out.println("Strike_rate="+ave);
		}
	}
	
}
