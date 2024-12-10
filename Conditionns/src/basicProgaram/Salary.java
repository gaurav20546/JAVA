package basicProgaram;

public class Salary {
	public static void main(String[] args) {
		double sal=Double.parseDouble(args[0]);
		double hra=sal*0.15;
		double ca=sal*0.15;
		double en=sal*0.10;
		double total=sal+hra+ca+en;
		System.out.println("Total sal ="+total);
	}

}
