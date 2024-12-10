package New;

class carNew
{
	private String brand;
	 private String model;
	 private int year;
	 private DriverNew Driver ;
	carNew( String brand,String model,int year,DriverNew Driver)
	{
		this.brand=brand;
		this.model=model;
		this.year=year;
		this.Driver=Driver;  
	}
	carNew(carNew object)
	{
		this.brand=object.brand;
		this.model=object.model;
		this.year=object.year;
		this.Driver =object.Driver  ;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public DriverNew getDriver() {
		return Driver ;
	}
	
	public void changeDriver(New.Driver newDri)
	{
		this.Driver=new DriverNew(newDri.getname(), newDri.getage());
	}
	@Override
	public String toString() {
		return "carNew [brand=" + brand + ", model=" + model + ", year=" + year + ", DriverNew=" + Driver + "]";
	}
	
	
}
class DriverNew
{
	private String name;
	private int age ;
	
	DriverNew(String name, int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public String  getname()
	{
		return name;
	}
	public void setname()
	{
		this.name=name;
		
	}
	public int getage()
	{
		return age;
	}
	public void setage()
	{
		this.age=age;
	}

	@Override
	public String toString() {
		return "DriverNew [name=" + name + ", age=" + age + "]";
	}
	
}



