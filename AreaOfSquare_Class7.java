package mktPrograms;

import java.util.Scanner;

public class AreaOfSquare_Class7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of area:");
		int a = sc.nextInt();
		
		int area = a*a;
		System.out.println("Area is:"+area);
		
		sc.close();

	}

}
