package Abstractinterface;

public class Imple3 implements C{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
		int c=b-a;
		System.out.println(c);
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("This is B interface method");
		
	}

	@Override
	public void D1() {
		// TODO Auto-generated method stub
		
		System.out.println("This is c interface method");
		
	}
	
	
	
	public static void main(String[] args)
	{
		C x1=new Imple3();
		
		x1.D1();
		
		x1.m2();
		
		x1.m3();
	}

	

}
