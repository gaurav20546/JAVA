package interfacee;

public class MainSimPhone {

	public static void main(String[] args) {
		Jio j=new Jio("7620926450");
		Airtel a=new Airtel("5645859652");
		BSNL b=new BSNL("56894585");
		MobilePhone Mo=new MobilePhone();
		Mo.insertingSim(j);
		Mo.makingCalls();
		Mo.sendingText();
		Mo.removingSim();
		
		
		
		
	}

}
