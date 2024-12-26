package interfacee;

import java.util.Scanner;
import java.util.function.*;

@FunctionalInterface
interface ObjectCreator
{
	public Object create(int id ,String name);
	
}

class Student
{
	static Scanner sc;
	private int id;
	private String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
 
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public void updateName(Consumer<String> nameUpadte)
	{
		sc=new Scanner(System.in);
		System.out.println("Enter updated Name:");
		
		String n1=sc.nextLine();
		nameUpadte.accept(n1);
		
	}

	public void setName(String name) 
		{
        this.name = name;
    }
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class Attribute {
    public static void main(String[] args) {
       
        ObjectCreator creator = (id, name) -> {
        	
        	return new Student(id, name);
        };

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ID :");
        int id=sc.nextInt();
               
        sc.nextLine(); 
        
        System.out.println("Enter the Name :");
        String str=sc.nextLine();
        
        Student s1=(Student)creator.create(id, str);
        System.out.println(s1);
        
        Consumer<String> c1 = (x)-> {
        s1.setName(x);	
        };
        
        s1.updateName(c1);
        System.out.println(s1);
        
       sc.close();
       
    
       
  
        
        	      
    }
}

/*
       -------------
Object Creation and Attribute Update using Functional Interface and Consumer.

You are tasked with creating a Java program that utilizes a custom functional interface for object creation and updates object attributes using a Consumer. .

Custom Functional Interface: ObjectCreator

Create a functional interface ObjectCreator with the following specifications:
Interface Name: ObjectCreator
Method Signature: Object create(int id, String name)
Return Type: Object
Parameters: id (int): , name (String)


BLC Class: Student
Create a class Student. This class should include:

Attributes:

int id: private 
String name: private

Constructor:
Student(int, String):
Initializes the id and name attributes of the object.

Method:
void updateName(Consumer<String> nameUpdater):
Accepts a Consumer that updates the name attribute of the object based on the provided logic.
Override toString method to display object details.

Main Class: ObjectCreatorMain
In the main method of the ObjectCreatorMain class:

Define and use a lambda expression to instantiate a CustomObject using the ObjectCreator interface. The lambda should return  an object of Student with id and name.
Call create method and store the object.

Use a Consumer lambda expression to update the name attribute of the created Student object. The Consumer should modify the name to include a suffix or any transformation logic.

Print the details of the updated Student instance to verify its attributes.

Test Case 1: Basic Creation and Update
Input:
id: 1
name: "John Doe"
Operation:
Update the name to "Jane Updated"
Expected Output:
Updated Student Details:
Student{id=1, name='Jane Updated'}
*/