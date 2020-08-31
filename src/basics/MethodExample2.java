package basics;

public class MethodExample2 {
	
	public void m1()
	{
		System.out.println("This is m1 method");
	}
	
	public void m2()
	{
		m1();
		System.out.println("This is m2 method");
	}
	
	public void m3()
	{
		m2();
		System.out.println("This is m3 method");
	}
	
	public void m4()
	{
		m3();
		System.out.println("This is m4 method");
	}
	
	public void m5()
	{
		m4();
		System.out.println("This is m5 method");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodExample2 e=new MethodExample2();
		
		e.m5();

	}

}
