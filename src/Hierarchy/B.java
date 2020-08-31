package Hierarchy;

public class B extends A{
	
	int a=100;
	static int b=200;
	
	String subname="Testng";
	static String subname1="jenkins";
	
	public B()
	{
		super();// by default
		System.out.println("This is b class constructor");
		
	}
	
	public void getVariables()
	{
		String subname="oops";
		String subname1="abstraction";
	
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(subname); // B class local variable
		System.out.println(subname1); // B class local variable
		
		System.out.println(this.subname); // B class global
		System.out.println(this.subname1); //B class global
		
		System.out.println(super.subname); //A
		System.out.println(super.subname1); // A
	}
	
	
	public void getmethod()
	{
		getVariables();
		
		super.getVariables();
	}

	public static void main(String[] args) 
	{
		
		B b=new B(); // constructor invoke
		
		b.getmethod();
		

	}

}
