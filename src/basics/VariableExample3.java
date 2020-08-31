package basics;

public class VariableExample3 {
	
	static String name="java"; // static variable   global area
	
	public void m1()
	{
		String name1="Selenium";    // local variable
		
		System.out.println(name1);
		System.out.println(name);
		
		//System.out.println(a);
	}
	
	
	public static void m2()
	{
		int a=100;                // local variable
		System.out.println(a);
		System.out.println(name);
		//System.out.println(name1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m2();
		
		VariableExample3 v3=new VariableExample3();
		
		v3.m1();
	}

}
