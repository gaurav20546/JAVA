package TryCatchBlock;

public class shoppingCart 
{
	private Product[] cartItems;
	private int itemCount;
	
	public shoppingCart(int capacity)
	{
		super();
		cartItems=new Product[capacity];
		itemCount=0;
	}
	
	public void addToCart(Product p,int quantity)throws InsufficientQuantityException 
	{
		if(p==null) {
			throw new InsufficientQuantityException("product not found !");
		} 
		for(int i=0;i<itemCount;i++)
		{
			if(cartItems[i].getId() == p.getId())
			{
				p.decreaseQuantity(quantity);
				return;
			}
		}
		 if (itemCount >= cartItems.length) 
		 {
	         throw new InvalidProductException("Cart is full. Cannot add more products.");
		 }
		 p.decreaseQuantity(quantity);
	        cartItems[itemCount++] = p;

		
	}
	
	public double calculateTotal()
	{
		  double total = 0.0;
	        for (int i = 0; i < itemCount; i++) 
	        {
	            total += cartItems[i].getPrice();
	        }
		return total;
		
	}
}
