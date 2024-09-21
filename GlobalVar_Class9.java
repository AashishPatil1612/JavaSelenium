package mktPrograms;

public class GlobalVar_Class9 {
	
	static int a=100;  //global variable
	int c = 80;

	public static void main(String[] args) {
		
		int b=90;  //local variable
		
		System.out.println(a);     // Addition global static var + local var.
		
		GlobalVar_Class9 g1 = new GlobalVar_Class9();   // Addition of global non-static var + local var
		System.out.println(g1.c+b);
		
	}

}
