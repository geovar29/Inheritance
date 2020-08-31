package Multilevel;

public class C1 extends B1 {
	
	public void m13()
	{
		System.out.println("This is C1 class m13 method");
	}
	
	public void m1()
	{
		System.out.println("This is C1 class m1 method");
	}
	
	public void m2()
	{
		m11(); //A1
		
		m12(); //B1
		
		m13(); //C1
		
		m1(); //C1
		
		this.m1(); //C1
		
		super.m1(); 
		
		A1 ab=new A1();
		
		ab.m11();
	}
	
	public static void m5()
	{
		System.out.println("This is c1 class m5 static method");
	}

	
	public static void m3()
	{
		m5();
		B1.m5();
		A1.m5();
	}
	public static void main(String[] args) {
		
		C1 cb=new C1();
		
		cb.m2();
		
		m3();

	}

}
