package TryCatchBlock;
class thread1 implements Runnable
{
	private int avalbleSeat=2;
	private int NoofBookSeat;
	
	public thread1(int seat)
	{
		this.NoofBookSeat=seat;
	}

	@Override
	public synchronized void  run() 
	{
		String name=Thread.currentThread().getName();
		if(avalbleSeat>=NoofBookSeat)
		{
			avalbleSeat -=NoofBookSeat;
			System.out.println(name+" "+NoofBookSeat+" Seat is booked  and avalable seats are "+avalbleSeat);
		}
		else 
		{
			System.out.println("seat is not avalble !");
		}	
	}
}

public class bookingTicket{

	public static void main(String[] args)
	{
		thread1 t=new thread1(1);
		Thread t1=new Thread(t,"ravi");
		Thread t2=new Thread(t,"teja");
		
		t1.start();
//		try {
//			t1.sleep(1000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		t2.start();
	}
}
/*Program 01:
----------
Write a program in java to show the drawback of Multithreading by booking Railway Reservation System.

In this scenario, only 1 seat is available and two threads are accessing this seat to book the ticket. 

Write a Program to show that both the thread will get the ticket. */