package Abstractinterface;

public class Imple2 implements B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B s2=new Imple2();
		
		s2.m2();
		
		

	}

	@Override
	public void m2() {
		
		
		int c=a+b;
		
		System.out.println(c);
		
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

}
