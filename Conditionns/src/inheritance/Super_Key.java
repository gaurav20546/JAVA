package inheritance;

//variable hiding concept
class Father
{
	protected double balence=20000;
	
}
class douther extends Father
{
	protected double balence=10000;
	
	public double  getbalence()
	{
		System.out.println("Douther balence is :"+this.balence);
		System.out.println("father balemce is :"+super.balence);
		return balence ;
	}
}
public class Super_Key 
{
	public static void main(String[] args) {
		douther d=new douther();
		d.getbalence();
	}
}
//To access the super class variable (Variable Hiding) :
//Whenever super class variable name and sub class 
//variable name both are same then it is called variable Hiding