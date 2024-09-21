package mktPrograms;

import mktPrograms.NonStatic_Class2;

public class NonStatic_Class2 {
	
	void addition()
	{
		System.out.println("Addition 2 numbers");
	}
	void substraction()
	{
		System.out.println("subtraction 2 numbers");
	}

	public static void main(String[] args) {
		
		System.out.println("my main method");
		
		NonStatic_Class2 n1= new NonStatic_Class2();
		n1.addition();
		n1.substraction();
		
		
	}

}
