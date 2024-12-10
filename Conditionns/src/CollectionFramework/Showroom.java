package CollectionFramework;

import java.util.Collection;

public class Showroom {

	public static void main(String[] args) {
		Factory bajaj=new Factory();
		 Collection<Bike>bikes= bajaj.order(5);
		 
		 System.out.println("Bikes ordered: " + bikes.size()); // Print the number of bikes
	        for (Bike bike : bikes) {
	            System.out.println(bike); // Print each bike instance (will display hash code unless overridden)
	        }

	}

}
