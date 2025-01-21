package TryCatchBlock;

public class ShoppingApplication {
		    public static void main(String[] args) {
		     
		        Product p1 = new Product(1, "Laptop", 50000, 5);
		        Product p2 = new Product(2, "Smartphone", 30000, 10);
		        Product p3 = new Product(3, "Headphones", 2000, 15);
		        shoppingCart cart = new shoppingCart(10);
		        try {
		            // Valid product addition
		            cart.addToCart(p1, 2);
		            cart.addToCart(p2, 1);

		            // Invalid product addition
		            cart.addToCart(null, 1);
		            
		        } catch (InvalidProductException e) {
		            System.out.println("InvalidProductException: " + e.getMessage());
		        } catch (InsufficientQuantityException e) {
		            System.out.println("InsufficientQuantityException: " + e.getMessage());
		        }

		        try {
		            // Insufficient quantity
		            cart.addToCart(p3, 20);
		        } catch (InsufficientQuantityException e) {
		            System.out.println("InsufficientQuantityException: " + e.getMessage());
		        }

		        try {
		            // Full cart
		            for (int i = 0; i < 10; i++) {
		                cart.addToCart(p3, 1);
		            }
		        } catch (InvalidProductException e) {
		            System.out.println("InvalidProductException: " + e.getMessage());
		        } catch (InsufficientQuantityException e) {
		            System.out.println("InsufficientQuantityException: " + e.getMessage());
		        }

		        // Calculate total price with mixed products
		        double total = cart.calculateTotal();
		        System.out.println("Total price of items in cart: " + total);
		    }
		}

