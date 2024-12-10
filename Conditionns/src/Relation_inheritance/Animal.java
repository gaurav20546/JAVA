//
//Attributes:-
//
//No Attributes
//
//methods:-
//
//return type :- void
//method Name :- eat
//behavior of eat method:- this method will print the message that "This animal eats food."
//------
//create derived class name as Dog inherit from Animal
//
//Attribute:-
//
//No Attributes
//
//
//methods:-
//
//return type :- void
//method Name :- bark
//behavior of bark method:- this method will print the Message "The dog barks."
//
//------
//create main class to test your logic 
//create object initialize the values and call the methods
//


package Relation_inheritance;
class animals
{
	public void eat()
	{
		System.out.println("The animals eats food  ");
	}
}
class dog extends animals
{
	public void bark()
	{
		System.out.println("the animal eat food ");
	}
}

public class Animal {
	public static void main(String[] args) {
		
		dog d=new dog();
		d.eat();
		d.bark();
		
	}

}
