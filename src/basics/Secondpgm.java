package basics;

public class Secondpgm {
	
	
	public void m1()  // instance method
	{
		System.out.println("Welcome");
	}
	
	
	public void m2()  // instance method
	{
		m1(); // instance to instance 
		m3();  // static to instance
		System.out.println("Selenium");
	}
	
	public static void m3()  // static method
	{
		m4(); //static to static
		System.out.println("Java");
		
		
	}
	
	public static void m4()  // static method
	{

		System.out.println("TestNG");
	}
	
	public static void main(String[] args)  //static method
	{
	
		
		//new Secondpgm(); // nameless object
		
		Secondpgm sp=new Secondpgm(); //named object sp
		
		sp.m2();  // instance to static 
		
		
		
	
	}
	
	
	
	// static method --- static method ---> direct
	
	// instance method --- instance method ---> direct
	
	//static method  --- instance method ---> direct
	
	//instance method --- static method ----> Object 
	

}
