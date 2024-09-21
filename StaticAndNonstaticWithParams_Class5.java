package mktPrograms;

import mktPrograms.StaticAndNonstaticWithParams_Class5;

public class StaticAndNonstaticWithParams_Class5 {
	
	static void add(int a)
	{
		System.out.println("Addition");
	}
	void sub(int b)
	{
		System.out.println("Subraction");
	}
	

	public static void main(String[] args) {
		
		add(100);
		
		StaticAndNonstaticWithParams_Class5 cl = new StaticAndNonstaticWithParams_Class5();
		cl.sub(100);

	}

}
