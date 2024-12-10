package OOP_Day_14;

public class Encapsulation_BLC {
	private int id;
	private String name;
	private double salary;
	
	public Encapsulation_BLC(int id,String name ,double salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}

	@Override
	public String toString() {
		return "Encapsulation_BLC [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
