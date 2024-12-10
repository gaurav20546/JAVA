package pollyMorphism;

public class Circle extends Shape{
	Circle()
	{
		
	}
	
	
	
	@Override
	public void draw()
	{
		System.out.println("Circle draw");
	}
	
	public void erase()
	{
		System.out.println("Circle erase");
	}

}
