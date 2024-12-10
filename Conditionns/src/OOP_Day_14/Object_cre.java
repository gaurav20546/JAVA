package OOP_Day_14;

public class  Object_cre{
	int x=100;
	
	public static void main(String[] args) {
		Object_cre t =new  Object_cre();
		Object_cre t1=new Object_cre();
		
		++t.x;   --t1.x;
		System.out.println(t.x);
		System.out.println(t1.x);
			
		
	}
}