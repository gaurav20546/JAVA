package interfacee;

public class LambaExpression {
	public static void main(String[] args) {
		Drawable car = ()->System.out.println("car is run");
		car.m1();
		
		Drawable bike= ()->System.out.println("bike is running");
		bike.m1();
	}

}
