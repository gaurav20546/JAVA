package OOP_Day_14;

public class Shado_Variable {
	private int sno;
	private String name;
	
	public void setno(int sno ,String name )//Parameter and class instance variable name same =shado
	{
		this.sno=sno;//this used only inside non static method 
		this.name=name;
	}
	public int getsno()
	{
		return sno;
	}
	public String getname()
	{
		return name;
	}
	public void dispaly()
	{
		System.out.println("a:"+sno);
		System.out.println("b:"+name);
	}

}
