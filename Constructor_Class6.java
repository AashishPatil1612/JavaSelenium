package mktPrograms;

import mktPrograms.Constructor_Class6;

public class Constructor_Class6 {
	
	Constructor_Class6()
	{
		System.out.println("Constructor");
	}
	
	Constructor_Class6(int a, int b)
	{
		int sum =a+b;
		System.out.println(sum);
	}


	public static void main(String[] args) {
		
		Constructor_Class6 c1 = new Constructor_Class6();
		Constructor_Class6 c2 = new Constructor_Class6(10,10);
		
	}

}
