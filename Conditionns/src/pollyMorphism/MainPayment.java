package pollyMorphism;

public class MainPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1=new Payment();
		Payment c = new CreditCardPayment();
        Payment p = new PayPalPayment();
        Payment b = new BankTransferPayment();
        processMultiplePayment(p1,c,p,b);
    
	}
	
	public  static void processMultiplePayment(Payment ...payments)
	{
		
		 for (Payment payment : payments) {
		
		payment.processPayment();
	}
		
	
	}
	
}
