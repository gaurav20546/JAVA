package mutipleinheritance;

public class Vehiclmain {

	public static void main(String[] args) {
		car c1=new car("Audi","Q8",2021,4);
		System.out.println("car deteals :");
		c1.display();
		
		
		Bike b1=new Bike("raju","RX100",2015,"modified");
		System.out.println("bike details");
		b1.Display();

	}

}
