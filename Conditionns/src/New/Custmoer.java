package New;
//Create the Customer Class
//-------------------------
//A class to represent a customer with details like name, email, and an order.
//
//Variable Declarations:
//private String name; — This variable stores the customer's name.
//private String email; — This variable stores the customer's email.
//private Order order; — This variable stores the order object.
//
//Constructor Declaration:
//public Customer(String name, String email, Order order) — A constructor to initialize the customer's name, email, and order.
//
//toString Method Declaration:
//@Override public String toString() — A method to return a string representation of the customer, including order details.

public class Custmoer {

	private String name;
	private String email;
	private order order;
	
	public Custmoer(String name,String email,order order)
	{
		this.name=name;
		this.email=email;
		this.order=order;
	}

	@Override
	public String toString() {
		return "Custmoer [name=" + name + ", email=" + email + ", order=" + order + "]";
	}
	
	
	
	
	
}
