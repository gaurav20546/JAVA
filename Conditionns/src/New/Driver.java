package New;
/*Create a Driver class and the class should have following attributes:
 private String name and
 private int age 
Implement a parameterised constructor to initialise all the instance variable of Driver.
Take a pair of setter and getter method for all the instance variables.
*/
public class Driver {
	 private String name;
	 private int age ;
	 public Driver(String name,int age)
	 {
		 this.name=name;
		 this.age=age;
		 
	 }
	 public String getname()
	 {
		 return name;
	 }
	 public void setname()
	 {
		 this.name=name;
	 }
	 public int  getage()
	 {
		 return age;
	 }

	 public void setage()
	 {
		 this.age=age;
	 }
	 
	 
	 
}
