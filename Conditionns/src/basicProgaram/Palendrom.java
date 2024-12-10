package basicProgaram;

public class Palendrom {
	public static void main(String [] args)
	{
		int a=Integer.parseInt(args[0]);
		int i,p;
		int o=a;
		int n=0;
		/*while(a!=0)
		{
			int p=a%10;//105
			 n=n*10+p;//5
			a=a/10;
			
		}*/
		for(i=0;a!=0;i++)
		{
			p=a%10;//105
			 n=n*10+p;//5
			 a=a/10;

			
		}
	
	if(n==o)
	{
		System.out.println("number is  is palendrom");
	}
	else
	{
		System.out.println("not  palendrom");
	}
	
	}
}
