package mktPrograms;

import java.util.Scanner;

public class AreaOfRectangle_Class7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter L value:");
		int L = sc.nextInt();
		
		System.out.println("Enter B value:");
		int B = sc.nextInt();
		
		int areaofrect = L*B;
		System.out.println(areaofrect);
		
		sc.close();

	}

}
