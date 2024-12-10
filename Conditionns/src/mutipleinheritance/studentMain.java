package mutipleinheritance;

public class studentMain {

	public static void main(String[] args) {
		SceinceStudent s1=new SceinceStudent("vankat",45,78,89,58);
		s1.displayDetails();
		
		ArtsStudent a1=new ArtsStudent ("ram",45,58,25,98);
		a1.display();
	}

}
