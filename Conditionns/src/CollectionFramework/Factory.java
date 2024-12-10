package CollectionFramework;
import java.util.ArrayList;
import java.util.Collection;


public class Factory {

		// TODO Auto-generated method stub
		
		Collection<Bike> order(int item)
		{
			Collection<Bike> bikes = new ArrayList<>();
			for(int i=0;i<item;i++)
			{
				Bike b1=new Bike();
				bikes.add(b1);
			}
			return bikes;
		}

	}


