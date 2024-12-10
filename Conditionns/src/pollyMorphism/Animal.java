package pollyMorphism;
/*Ques - 1
------------
Scenario: Zoo Simulation with Animal Behaviors 
Base Class - Animal:
----------------------
Create a class named Animal with the following attributes:
species (String): Represents the species of the animal.
Implement a parameterized constructor to initialize the species attribute.
Include getter method for species.
Implement methods:
makeSound(): Prints a generic animal sound.
toString(): Returns a string representation of the animal.
reproduce(): It prints the message "Generic reproduction method for all animals." and returns a new Animal object with the species set to "Unknown." 
*/
public class Animal {
	private String species;
	
	Animal(String species)
	{
		this.species=species;
	}
	
	public String getspecies()
	{
		return species;	
	}
	public void setspecies()
	{
		this.species=species;
	}
	
	public void makesound()
	{
		System.out.println("animal make a sound ");
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + "]";
	}
	public Animal reproduce()
	{
		System.out.println("Generic reproduction method for all animals");
		return new Animal("unkwon");
	}
}
