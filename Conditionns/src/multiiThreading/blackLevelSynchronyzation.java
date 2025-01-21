package multiiThreading;
class ThreadName{
	public void printThreadName()
	{
		String name=Thread.currentThread().getName();
		System.out.println("Running thread name is :"+name);
		
		synchronized(this)
		{
			for(int i=1;i<10;i++)
			{
				System.out.println("value of i :"+i+"Name :"+name);
			}
			
			System.out.println("Sysnchrnoised block :"+name);
		}
	}
}

public class blackLevelSynchronyzation 
{
	public static void main(String[] args) {
		ThreadName t =new ThreadName();
		Runnable r1 = ()-> t.printThreadName();
		Thread t1 = new Thread(r1,"child1");
		Thread t2 = new Thread(r1,"child2");
		
		t1.start();
		t2.start();
		
	}
}
/*class ThreadName
{
	public void printThreadName()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Running Thread name is :"+name);
				
		synchronized(this)
		{
			System.out.println("Synchronized block started by thread :"+name);
			for(int i = 1; i<=10; i++)
			{
				System.out.println("i value is :"+i+" by "+name);
			}
			System.out.println("Synchronized block ended by thread :"+name);
		}
	}
	
	
}


public class BlockLevelSynchronization {

	public static void main(String[] args) 
	{
		ThreadName tn = new ThreadName();
		
		Runnable r1 = ()-> tn.printThreadName();
		
		Thread t1 = new Thread(r1,"Child1");
		Thread t2 = new Thread(r1,"Child2");
		
		t1.start();  t2.start();

	}

}*/
