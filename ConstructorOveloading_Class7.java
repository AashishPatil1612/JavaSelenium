package mktPrograms;

import mktPrograms.ConstructorOveloading_Class7;

public class ConstructorOveloading_Class7 {
	
	ConstructorOveloading_Class7()
	{
		System.out.println("1st");
	}
	
	ConstructorOveloading_Class7(int a)
	{
		System.out.println("2nd");
	}
	
	ConstructorOveloading_Class7(int a, int b)
	{
		System.out.println("3nd");
	}

	public static void main(String[] args) {
		
		new ConstructorOveloading_Class7();
		new ConstructorOveloading_Class7(100);
		new ConstructorOveloading_Class7(100, 200);
	}

}
