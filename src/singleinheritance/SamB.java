package singleinheritance;

public class SamB extends SamA{

	public void m1()
	{
		System.out.println("Child class method");
	}
	
	public static void m2()
	{
		System.out.println("Child class static method");
	}
	
	
	public void m3()  // instance method to instance method
	{
		m1();
		super.m1();
	}
	
	public void m4()  // static method to instance method
	{
		m2();
		super.m2();
	}
	
	
	public static void m5() // static method to static method
	{
		m2();
		SamA.m2();
	}
	
	
	public static void m6() // instance method to static method
	{
		SamB b=new SamB();
		b.m1();
		
		SamA a=new SamA();
		
		a.m1();
	}
	
	public static void main(String[] args) 
	{
		SamB b=new SamB();
		
		b.m1();
		
		b.m2();

	}

}
