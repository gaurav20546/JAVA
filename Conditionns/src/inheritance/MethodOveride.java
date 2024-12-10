package inheritance;
//To call super class method :
class Alpha{
	public String toString()
	{
		return "india";
		
	}
}
class Beta extends Alpha
{
	public String toString()
	{
		System.out.println("super :"+super.toString());
		return"Hydrabad";
	}
}
public class MethodOveride {
	public static void main(String[] args) {
		Beta b=new Beta();
		
		System.out.println("chile :"+b.toString());
	}

}
//If the super class non static method name and sub class non static method 
//name both are same (Method Overriding)