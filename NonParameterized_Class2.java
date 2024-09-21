package mktPrograms;

import mktPrograms.NonParameterized_Class2;

public class NonParameterized_Class2 {
	
	static void addition()
	{
		System.out.println("Adition");
	}
	
	void subtraction()
	{
		System.out.println("subtraction");
	}

	public static void main(String[] args) {
		
		addition();
		
		NonParameterized_Class2 n1=new NonParameterized_Class2();
		n1.subtraction();
		
		

	}

}
