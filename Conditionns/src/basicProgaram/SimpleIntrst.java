package basicProgaram;

public class SimpleIntrst {
	public static void main(String[] args) {
		double Pri=Double.parseDouble(args[0]);
		double Rate=Double.parseDouble(args[1]);
		double Time=Double.parseDouble(args[2]);
		double Sint=(Pri*Rate*Time)/100;
		System.out.println("Priciple amou="+Pri +"\n Rate ="+Rate +" \n time ="+Time);
		System.out.println("Simple Interst ="+Sint +" \nAmout ="+(Sint+Pri));
		
		
	}

}
