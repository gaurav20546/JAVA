package AbstractProgramms;

public class Tester {

	
	/*Create an ELC class Testing
	The first line contains an integer, n, the number of food items.

	Every food item takes input in the next 4 lines where the first line is the name of the food and 
	the next three lines are method calls (getType, getTaste, and getMacros)
	
Bread is vegetarian
A slice of bread has 4.0 gms of protein, 1.1 gms of fats and 13.8 gms of carbohydrates.
Taste: 8*/ 
	
	public static void main(String[] args) {
		egg e =new egg(4.0,1.1,13.8,8,"Vegiterian");
		System.out.println("Bread is "+e.gettype());
		e.getMacroNutrients();
		System.out.println("taste :"+e.gettastyScore());

	}

}
