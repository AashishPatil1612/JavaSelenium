package mktPrograms;

import mktPrograms.MethodOverloading_Class6;

public class MethodOverloading_Class6 {
	
	static void addition(int a, int b) 
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	static void addition(int a, double b) 
	{
		double sum = a+b;
		System.out.println(sum);
	}
	
	static void addition(double a, int b) 
	{
		double sum = a+b;
		System.out.println(sum);
	}
	
	static void addition(double a, double b) 
	{
		double sum = a+b;
		System.out.println(sum);
	}
	
	void subtraction(int a, int b)
	{
		int sub = a-b;
		System.out.println(sub);
	}
	void addition()
	{
		int a=100;
		int b=200;
		int sum =a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		addition(10, 20);
		addition(10,10.5);
		addition(10.5, 10);
		addition(10.5, 10.5);
		
		MethodOverloading_Class6 m1 = new MethodOverloading_Class6();
		m1.subtraction(20, 5);
		m1.addition();
			

	}

}
