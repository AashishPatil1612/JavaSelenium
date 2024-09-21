package mktPrograms;

import java.util.Scanner;

public class ScannerMethod_Class8 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your first name:");
		String Firstname = sc.next();
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		System.out.println("Are you graduate?");
		boolean b1 = sc.nextBoolean();
		
		sc.close();

	}

}
