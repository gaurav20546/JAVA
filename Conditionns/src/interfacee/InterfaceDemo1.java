package interfacee;

sealed interface Moveable permits Car
{
	int SPEED=100;
	void move();
}
non-sealed class Car implements Moveable
{
	@Override
	public void move()
	{
		System.out.println("car is moveint with :"+SPEED);
	}
	
}




public class InterfaceDemo1 {
	public static void main(String[] args) {
		Moveable m=new Car();
		m.move();
		System.out.println("speed of car is :"+Moveable.SPEED);
	}

}
