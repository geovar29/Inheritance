package Hierarchy;

public class C extends A{
	
	
	public float f1=100.5f;
	
	public C()
	{
		System.out.println("This is C class costructor");
	}
	
	
	public void getVariables()
	{
		System.out.println(f1);
		
		System.out.println("This is C class method");
		
		super.getVariables();
	}
	
	
	public static void main(String[] args) 
	{
	     C c=new C();
	     
	     c.getVariables();
	}

}
