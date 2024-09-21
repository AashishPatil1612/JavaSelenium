package mktPrograms;

import java.util.Scanner;

public class ScannerClass_Class7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age Anil:");
		int Anil = sc.nextInt();
		
		System.out.println("Enter your age Mahesh:");
		int Mahesh = sc.nextInt();
		
		int sum = Anil+Mahesh;
		System.out.println("Total Age:"+sum);
		
		sc.close();

	}

}
