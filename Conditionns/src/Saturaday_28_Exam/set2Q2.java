package Saturaday_28_Exam;

abstract class Task{
	String Taskname;
	int priority;

	public Task(String task, int level)
	{
		super();
		Taskname = task;
		this.priority = level;
	}
	
	 public abstract String completeTask();//return status complete task
	 public abstract String displayTaskInfo();//return task information
	
	public String  displayPriority()
	{
		//System.out.println("priivority level"+priority);
		return "Privority level" + priority;
		
	}
	
}

public class set2Q2 extends Task{
	String Duedate;
	public set2Q2(String task, int level,String Duedate) {
		super(task, level);
		this. Duedate= Duedate;
	}


	

	@Override
	public String completeTask() {
		// TODO Auto-generated method stub
		return Taskname;
	}

	@Override
	public String displayTaskInfo() {
		
		return "Task Name: " + Taskname + "\nPriority: " + priority + "\nDue Date: " + Duedate;
  
	}
	
	public static void main(String[] args) {
		set2Q2 p=new set2Q2("aws",12,"12-jan");
		
		System.out.println(p.displayTaskInfo());
        System.out.println(p.displayPriority());
        System.out.println(p.completeTask());
		
		
	}
}


/*
Abstract Task Management System

Create an abstract class named Task with the following attributes and methods:

Attributes:

taskName (String): representing the name of the task.
priority (int): indicating the priority level of the task.
Methods:

completeTask(): abstract method that should return a string indicating the completion status of the task.
displayTaskInfo(): abstract method that should return a string representing task information.
Additionally, implement a common method:

displayPriority(): a method with a default implementation in the abstract class that returns a string displaying the priority level.
Create a concrete subclass that extends Task:

AssignmentTask:
Create an additional attribute dueDate (String) for the assignment deadline.
Initialize the attributes using a parameterized constructor.
Implement the completeTask and displayTaskInfo methods.
In a TaskMain class:

Create instances of both Task and AssignmentTask.
Demonstrate the usage of all methods, including the common displayPriority method.
===================================

*/