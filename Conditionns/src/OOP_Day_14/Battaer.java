package OOP_Day_14;

public class Battaer {
	private String name;
	private int run;
	private int matches;
	private float avg;
	
	public void batterDetails(String name,int run,int matches)
	{
		this.name=name;
		this.run=run;
		this.matches=matches;
		
	}
	public void batting_avg(int matches)
	{
		if(run<0)
		{
			System.out.println("Eroor");
		}
		else if(run>0 && matches<0)
		{
			System.out.println("Error");
		}
		else
		{
		this.avg=run/matches;
		System.out.println("name="+name);
		System.out.println("strike_rate="+avg);
		}
		
		
	}
}
