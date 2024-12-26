package interfacee;

@FunctionalInterface
public interface  Printable {
	
	String print(String st);//SAM=>single abstract method

	default void m1()
	{
		
	}
	
	 default public void m2()
	{
		System.out.println("sai baba");
	}
}
