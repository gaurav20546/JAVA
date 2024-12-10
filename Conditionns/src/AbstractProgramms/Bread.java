package AbstractProgramms;
/*3. class Bread which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 8
String type = "vegetarian"
void getMacroNutrients => prints(" A slice of bread has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")
 

Create an ELC class Testing
The first line contains an integer, n, the number of food items.

Every food item takes input in the next 4 lines where the first line is the name of the food and the next three lines are method calls (getType, getTaste, and getMacros) 
*/
public class Bread extends Food {
	String type = "vegetarian";

	Bread(double proteins, double fats, double carbs, double tastyScore,String type) {
		super(proteins, fats, carbs, tastyScore);
		this.tastyScore=8;
		this.type=type;
		
	
	}

	public String gettype()
	{
		return type;
	}

	@Override
	public void getMacroNutrients() {
		System.out.println(" A slice of bread has "+proteins+ "gms of protein,"+fats+"+ gms of fats and"+carbs+" gms of carbohydrates.");
		 
		
	}
	public double gettastyScore()
	{
		return tastyScore;
	}
	
	 

}
