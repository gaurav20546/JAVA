package pollyMorphism;
/*ELC  - ZooSimulation:

Create an ELC named ZooSimulation that:

Instantiates a Mammal object (e.g., lion) with sample data.
Invokes methods on the Mammal object to demonstrate mammal-specific behaviors.
Instantiates a Bird object (e.g., eagle) with sample data.
Invokes methods on the Bird object to demonstrate bird-specific behaviors*/
public class MainAnimal {

	public static void main(String[] args) {
		Mammal m=new Mammal("lion",false);
		m.makesound();
		m.toString();
		m.reproduce();
		m.nurseYoung();
		System.out.println("-----------------------------------------------");
		Bird b=new Bird("parrote",true);
		b.makesound();
		b.toString();
		b.reproduce();
		b.buildNest();

	}

}
