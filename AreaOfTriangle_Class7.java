package mktPrograms;

import java.util.Scanner;

public class AreaOfTriangle_Class7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of base");
		double b = sc.nextDouble();
		
		System.out.println("Enter the value of height");
		double h = sc.nextDouble();
		
		double areaoftriangle = 0.5*b*h;
		System.out.println("areaoftriangle is:"+areaoftriangle);
		
		sc.close();

	}

}
