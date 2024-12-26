package New;

public class Tiger implements Water {
	@Override
	public void water()
	{
		System.out.println("tiger Dring water");
	}

}

class dog implements Water
{
	@Override
	public void water()
	{
		System.out.println("dog dring Water");
	}
}
