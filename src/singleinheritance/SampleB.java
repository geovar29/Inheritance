package singleinheritance;

public class SampleB extends SampleA
{
	String name="George";
	
	static int a=1;
	
	//default constructor
	
	/*public SampleB()
	{
		super();
	}*/
	
	public void m2()   //instance variable to instance method
	{
		String name="Ragul";
		
		System.out.println(name);       //local var
		
		System.out.println(this.name);  //child class global var
		
		System.out.println(super.name); // parent class global var
	}
	
	
	public void m3()   // static variable to instance method
	{
		int a=10;
		
		System.out.println(a);
		
		System.out.println(this.a);
		
		System.out.println(super.a);
	}
	
	
	public static void m4()  // static  variable to static method
	{
		int a=5;
		
		System.out.println(a);
		
		System.out.println(SampleB.a);
		
		System.out.println(SampleA.a);
	}
	
	public static void m5()  // instance variable to static method
	{
		String name="info";
		
		System.out.println(name);
		
		SampleB b=new SampleB();
		
		System.out.println(b.name);
		
		SampleA a=new SampleA();
		
		System.out.println(a.name);
		
		
	}

	public static void main(String[] args) {
		
		SampleB b=new SampleB();
		
		b.m2();
		
		b.m3();
		
		m4();
		
		m5();
		
		
		
	

	}

}
