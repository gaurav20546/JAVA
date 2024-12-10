package New;
//Create the Order Class 
//----------------------
//A class to represent an order with details like order ID and product name.
//
//Variable Declarations:
//private String orderId; — This variable stores the order ID.
//private String productName; — This variable stores the name of the product ordered.
//
//Constructor Declaration:
//public Order(String orderId, String productName) — A constructor to initialize the order ID and product name.
//
//Getter Methods Declaration:
//public String getOrderId() — A method to get the order ID.
//public String getProductName() — A method to get the product name.
//
//toString Method Declaration:
//@Override public String toString() — A method to return a string representation of the order.
public class order {

	private String orderId;
	private String productName;
	
	public order(String orderId,String productName)
	{
		if(Integer.parseInt(orderId)<=0)
		{
			System.err.println("Error invalid Id");
			System.exit(0);
		}
		this.orderId=orderId;
		this.productName=productName;
		
	}
	public String getoederId()
	{
		return orderId;
	}
	
	public String getproductName()
	{
		return productName;
	}
	@Override
	public String toString() {
		return "order [orderId=" + orderId + ", productName=" + productName + "]";
	}
	
	
	
	
}
