package basics;

public class VariableExample2 {
	
	static String name ="java";  //static variable   global area
	
	int a=100;     // instance variable  global area
	
	public void m1()  //instance method
	{
		System.out.println(name);
		
		System.out.println(a);
	}
	
	
	public static void m2() //static method
	{
		System.out.println(name);
		
		VariableExample2 v2=new VariableExample2();
		
		System.out.println(v2.a);
	}
	
	public void m3()
	{
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		m2();
		
		VariableExample2 v2=new VariableExample2();
		
		v2.m1();

	}
	
	//static variable ---> instance method ---> direct
	
	//static variable ---> static method ---> direct

	//instance variable ---> instance method ---> direct
	
	//instance variable ---> static method ---> object
}
