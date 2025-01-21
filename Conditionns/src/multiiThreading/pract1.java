package multiiThreading;

class printable implements Runnable
{
	int num;
	printable(int num)
	{
		this.num=num;
	}

	@Override
	public void run() {
		System.out.println("table is started :");
		for(int i=0;i<=10;i++)
		{
			System.out.println(i+"*"+num+"="+i*num);
		}
		
	}
	
}
public class pract1 {
	
	public static void main(String[] args)
	{
		printable p= new printable(5);
		
		Thread t1= new Thread(p);
		t1.start();
	}

}
