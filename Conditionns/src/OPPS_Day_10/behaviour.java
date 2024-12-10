package OPPS_Day_10;

public class behaviour {

	public static void main(String[] args) {
		Fan tab=new Fan();
		
		tab.name="bajaj";
		tab.coil="bajajcoil";
		tab.Wings=4;
		tab.Fandetails();
		System.out.println("===================");
		tab.switchOn() ;
		System.out.println("===================");
		tab.switchOff() ;

	}

}
