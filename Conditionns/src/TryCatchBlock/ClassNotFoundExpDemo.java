package TryCatchBlock;
//class c{
	
//}
public class ClassNotFoundExpDemo {
	public ClassNotFoundExpDemo(){
		Class c;
		try {
			c=Class.forName("TryCatchBlock.SimpleExceptionDemo");
			System.out.println("complete :");
		}
		catch(ClassNotFoundException e)
		{
			
			e.printStackTrace();
		}
				
	}
	public static void main(String[] args)
	{
		
		ClassNotFoundExpDemo p=new ClassNotFoundExpDemo();
		

	}

}
/*4. ClassNotFoundException…
a. Write a program to create a class ‘ClassNotFoundExpDemo’ which implements default constructor as follows ,
public ClassNotFoundExpDemo { Class c; try { c = Class.forName("TestClass"); } catch (ClassNotFoundException e) { // deal with the exception here ... e.printStackTrace(); } }
b. Implement the main method and inside main method create an object of ClassNotFoundExpDemo class.
c. Now check the O/P.*/