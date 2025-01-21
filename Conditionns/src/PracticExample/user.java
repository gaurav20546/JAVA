package PracticExample;

import java.util.Scanner;
class table implements Runnable
{
	int num;

	@Override
	public void run() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no for table :");
		int num=sc.nextInt();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(num*i);
		}
		String name=Thread.currentThread().getName();
		System.out.println(name);
	}
	
}
public class user {

	public static void main(String[] args) {
		
		
		table t1=new table();
		Thread t2 = new Thread(t1,"ranitable");
		Thread t3 = new Thread(t1,"rajatable");
		t2.setPriority(2);
		try {
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t3.setPriority(10);
		t3.start();
		t2.start();

	}

}
