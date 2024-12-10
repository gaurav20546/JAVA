package OOP_Day_14;
import java.util.*;

public class Reverse_String {
	public static void main(String[] args) {
		String str = "gaurav";
	
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        for(char arrr : arr)
        {
        	System.out.print(arrr);
        }
        int len =arr.length;
        System.out.println("lenth="+len);
        for(int i=len-1;i>=0;i--)
        {
        	System.out.print(arr[i]);
        }
		
		
	
	}
}
