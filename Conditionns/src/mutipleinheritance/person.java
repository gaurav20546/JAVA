package mutipleinheritance;

public class person {
	
	String name;
	int age;
	
	person(String name ,int age )
	{
		
		this.name=name;
		this.age=age;	
	}
	
	public void displayp()
	{
		System.out.println("person name is"+name+"\n age="+age);
	}
	
}
