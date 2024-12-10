package OPPS_Day_10;

import java.util.Scanner;

public class Getkingdomdetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Maratha King=new Maratha();
		King.name="Chatrapati Shivaji Maharaj";
		King.Bplace="Shivneri";
		King.height=5.1;
		King.Totkingdom=240;
		King.Samrajya();
		System.out.println("============================================");
		King.name="ShahajiRaje";
		King.Bplace="Ahemadnagar";
		King.height=5.8;
		King.Totkingdom=3;
		King.Father();
		System.out.println("=============================================");
		King.name="ShambhuRaje";
		King.Bplace="Shivneri";
		King.height=6.2;
		King.Totkingdom=57;
		King.Father();
		
		
		
	}

}
