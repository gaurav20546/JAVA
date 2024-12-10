package basicProgaram;

public class Bill_genrat {
	public static void main(String[] args) {
		int chiken=Integer.parseInt(args[0]);
				int veg=Integer.parseInt(args[1]);
				int chikenn=60;
				chikenn=chikenn*chiken;
				int veeg=25;
				veeg=veeg*veg;
				int total=chikenn+veeg;
				System.out.println("chikken price="+chikenn +"chiken :"+chiken );
				System.out.println("chikken price="+ veeg +" veg :" +veg );
				System.out.println("total :" +(total-50));
		
	}

}
