package Abstraction;

public abstract class Sample 
{
	public Sample()
	{
		System.out.println("This is constructor");
	}
	
	public abstract int add(int a, int b);  // abstract 
	
	public abstract int mul(int a, int b);
	
	public abstract float add(float a, float b);
	
	public void div()
	{
		System.out.println("This is div method");
	}
	
	public static void s1()
	{
		System.out.println("This is static method");
	}
	
	{
		System.out.println("instance block");
	}
	
	static
	{
		System.out.println("static block");
	}
	
	public static void main(String[] args)
	{
		s1();
	}

}
