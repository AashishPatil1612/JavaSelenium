package mktPrograms;

public class GlobalVar_2_Class9 {
	
	static int a=100;
	
	int b=90;
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		
		GlobalVar_2_Class9 g1 = new GlobalVar_2_Class9();
		g1.b=95;
		System.out.println(g1.b);	  // Updating the value of global variable

	}

}
