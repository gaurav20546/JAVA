package tokensInJava;

public class HexaDecimalLitral {
public static void main(String[] args) {
	//it starts with 0 or x (0 or X && 0 or X)
	//its range is 0 to 9and a to f
	int b=0x123;
	System.out.println(b);
}
}

/* (1 × 16^2) + (2 × 16^1) + (3 × 16^0)
= (1 × 256) + (2 × 16) + (3 × 1)
= 256 + 32 + 3
= 291
*/