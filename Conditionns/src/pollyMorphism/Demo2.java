package pollyMorphism;

class a{
	public int add(int a ,int b)
	{
		int c=a+b;
		return c;
	}
}
class b{
	public int add(int a,int b,int c)
	{
		int tot=a+b+c;
		return tot;
	}
}

public class Demo2 
{
	public static void main(String[] args) {
		a A= new a();
		
		System.out.println(A.add(10,20));
		
		b B=new b();
		System.out.println("add 3 no "+B.add(20, 20, 23));
	}

}
