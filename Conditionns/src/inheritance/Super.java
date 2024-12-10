package inheritance;
//Program on Single Level Inheritance :
class Superr
{
	private int x,y;
	
	public void setData(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getX()
	{
		return x;
		
	}
	public int getY()
	{
		return y;
	}

}
class sub extends Superr
{
	public void ShowData()
	{
		System.out.println("x value :"+getX());
		System.out.println("y value :"+getY());
	}

}
public class Super
{
	public static void main(String[] args)
	{
		sub t=new sub();
		t.setData(5, 5);
		t.ShowData();
		
	}

}//Note : By default private varaible of super class is not available to sub class, getter is required.

 
