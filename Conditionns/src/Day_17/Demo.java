package Day_17;

public class Demo
{
	Demo t;
	int val;

	public Demo(int val)  
	{
		this.val = val;
	}

	public Demo(int val, Demo t)
	{
		this.val = val;
		this.t = t;
	}

	public static void main(String[] args) 
	{
		Demo t1 = new Demo(100);
		
		Demo t2 = new Demo(200,t1);

		Demo t3 = new Demo(300,t1);

		Demo t4 = new Demo(400,t2);

		t2.t = t3; 
		t3.t = t4; 
		t1.t = t2.t; 
		t2.t = t4.t; 

	System.out.println(t1.t.val);
	System.out.println(t2.t.val);
	System.out.println(t3.t.val);
	System.out.println(t4.t.val);
	}
	
}  

