package New;
//Create Shoping class
//---------------------
//-> Create main method 
//-> Create an Order object.
//-> Create a Customer object that includes the Order.
//-> Display the Customer information.
//
//Condition :
//-----------
//if any numeric value is zero or negative then print "Error Invalid Input".
//
//
//TEST CASE 1 :
//-------------
//sample input  : When your reading numeric values for any above Classe then make sure if any numeric value is <=0 then print "Error Invalid Input".
//                
//sample output : Error Invalid Input
//
//
//TEST CASE 2:
//------------
//sample input  :
//                Order order = new Order("123456", "Laptop");
//                Customer customer = new Customer("James", "James@example.com", order);
//                System.out.println(customer);
//
//sample output : Customer Name: James, Email: James@example.com, Order ID: 123456, Product Name: Laptop
public class Shoping {
	public static void main(String[] args) {
		
		order o=new order("0","apple");
		Custmoer c=new Custmoer("ram","ram@mail",o);
		System.out.println(c);
	}

}
