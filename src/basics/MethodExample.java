package basics;

public class MethodExample {
	
	public void m1()
	{
		System.out.println("This is m1 method");
	}
	
	public void m2()
	{
		System.out.println("This is m2 method");
	}
	
	public void m3()
	{
		
		System.out.println("This is m3 method");
	}
	
	public void m4()
	{
		
		System.out.println("This is m4 method");
	}
	
	public void m5()
	{
		m1();
		m2();
		System.out.println("This is m5 method");
		m3();
		m4();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MethodExample m=new MethodExample();
     
     m.m5();
	}

}
