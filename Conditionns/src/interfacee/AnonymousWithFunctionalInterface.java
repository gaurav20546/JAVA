package interfacee;

public class AnonymousWithFunctionalInterface  
{
	public static void main(String[] args) 
	{
		Printable p=new Printable()
		{

			@Override
			public String print(String g) 
			{
				System.out.println("inner class make a payment");
				return g;
			}
		
			
			
		};
		p.m2();
		System.out.println(p.print("ram"));
	}
	

}
