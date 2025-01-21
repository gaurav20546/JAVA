package TryCatchBlock;
public class Main implements Runnable
{
	Thread thread;
	public Main() 
	{
		thread = new Thread(this);
		thread.start();
	}
	public void run() {
		System.out.println(thread);
		
	}	
	public static void main(String[] args) 
	{
		new Main();
	}
}

