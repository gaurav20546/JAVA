package interfacee;

public class MobilePhone implements MobilePhoneInterface {

	@Override
	public void insertingSim(SIMCardInterface s) {
		s.NetorkPro();
		s.getPhoneNO();
		System.out.println("Sim card insert succusfully :");
		
		
	}

	@Override
	public void removingSim() {
		
		System.out.println("Sim removed from mobail :");
		
	}

	@Override
	public void makingCalls() {
		System.out.println("making the calls ");
		
	}

	@Override
	public void sendingText() {
		System.out.println("Sending the text :");
	}

}
