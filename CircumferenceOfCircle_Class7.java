package mktPrograms;

import java.util.Scanner;

public class CircumferenceOfCircle_Class7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of PI:");
		double pi = sc.nextDouble();
		
		System.out.println("Enter the value of radius:");
		double r = sc.nextDouble();
		
		double circumferenceofcircle = 2*pi*r;
		System.out.println("circumferenceofcircle is:"+circumferenceofcircle);
		
		sc.close();

	}

}
