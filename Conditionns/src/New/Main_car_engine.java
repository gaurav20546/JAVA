package New;
////Create TestCar class
//---------------------
//-> Create main method 
//-> Create an engine object.
//-> Create a car object that includes the engine.
//-> Display the car's information.
//
//
//Condition :
//-----------
//if any numeric value is zero or negative then print "Error Invalid Input".
//
//
//TEST CASE 1 :
//-------------
//sample input  : When your reading numeric values for any above Classe then make sure if any numeric value is <=0 then print "Error Invalid Input".
//                
//sample output : Error Invalid Input
//
//
//TEST CASE 2:
//------------
//sample input  :
//                Engine engine = new Engine("V6 Hybrid");
//                Car car = new Car("Hyundai", "Camry", engine);
//                System.out.println(car);
//
//sample output : Car Make: Hyundai, Model: Camry, Engine Model: V6 Hybrid

public class Main_car_engine {
	public static void main(String[] args) {
		engeen e=new engeen("1400");
		car c=new car("odd","ram",e);
		System.out.println(c);
		
	}

}
