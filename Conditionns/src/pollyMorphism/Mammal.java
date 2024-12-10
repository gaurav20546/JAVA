package pollyMorphism;
/*Subclass - Mammal:
---------------------

Create a subclass named Mammal that extends the Animal class.
Add an additional attribute:
hasFur (boolean): Indicates whether the mammal has fur.
Implement a parameterized constructor to initialize the attributes of both the Animal class and the Mammal class.
Override the makeSound() and toString() methods in the Mammal class.
@Override reproduce(): 
In the Mammal subclass, the reproduce() prints the message "Mammals give birth to live young." and returns a new Mammal object with the same species and fur attribute as the parent mammal.  
Implement an additional method:
nurseYoung(): Prints a message about mammals nursing their young.*/
public class Mammal extends Animal {
	boolean hasFur;
	Mammal(String species,boolean hasFur)
	{
		super(species);
		this.hasFur=hasFur;
	}
	@Override
	public void makesound()
	{
		System.out.println("animal make a sound ");
	}

	@Override
	public String toString() {
		return "Animal [species=" +getspecies()+ "]";
	}
	@Override
	public Animal reproduce()
	{
		System.out.println("Generic reproduction method for all animals");
		return new Mammal(super.getspecies(),this.hasFur);
	}
	public void nurseYoung()
	{
		System.out.println("mammals nursing their young");
		
	}

}
