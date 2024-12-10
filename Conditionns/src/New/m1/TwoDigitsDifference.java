package New.m1;
//BLc
public class TwoDigitsDifference {
	public static int diffBtw(int no)
	{
	int no2=no%10;
	no=no/10;
	no=no-no2;
	return no;
	}
	
}
