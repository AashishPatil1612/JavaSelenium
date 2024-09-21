package mktPrograms;

import java.util.Scanner;

public class AreaOfCircle_Class7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of PI:");
		double pi = sc.nextDouble();
		
		System.out.println("Enter the value of radius:");
		double r = sc.nextDouble();
		
		double Area = pi*r*r;
		System.out.println("Area of circle is:"+Area);	
		
		sc.close();

	}

}
