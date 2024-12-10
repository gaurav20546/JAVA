package OOP_Day_14;

public class TO_String_BLC {
	int id;
	String name;
	double sal;
	
	public void getdet(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void ToString()
	{
		
	}
	@Override
	public String toString() {
		return "TO_String_BLC [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

}
