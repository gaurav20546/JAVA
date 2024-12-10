package pollyMorphism;

public class Shape
{
	public static Shape randshape()
	{
		int n=((int) (Math.random()*3));
		switch(n)
		{
		case 0:
		{
			return  new Circle();
			
		}
		case 1:
		{
			return new Square();
		}
		case 2:
		{
			return new Tringle ();
		}
		default:
		{
			System.out.println("-------");
			return new Shape();
		}
			
			
		}
			
		
	}
	
	public void draw()
	{
		System.out.println("draw");
	}
	public void erase()
	{
		System.out.println("erase");
	}
	Shape()
	{	
		
	}
	
	

}