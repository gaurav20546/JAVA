package TryCatchBlock;
public class Product 
{
	int id;
	String name;
	double price ;
	int quantity;

	public Product(int id,String name,double price,int quantity)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}

	public void decreaseQuantity(int quantity) throws InsufficientQuantityException 
	{
		if(this.quantity<quantity)
		{
			throw new InsufficientQuantityException(" requested quantity is not available.");
		}
		else {
			this.quantity-=quantity;
			System.out.println(quantity+"Quantity decrese succusfully "+"current quantity is "+this.quantity);
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
}
