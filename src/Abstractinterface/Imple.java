package Abstractinterface;

public class Imple implements B{

	public static void main(String[] args) 
	{
	       B s1=new Imple();
	       
	       s1.m2(); //abstract
	       
	       s1.m3(); //abstract
	       
	       B.m1(); //static ---> This is static method
	       
	       System.out.println("Variable a ="+ B.a); //10
	       
	       System.out.println("Variable b ="+ B.b); //20

	}

	@Override
	public void m2() {
		
		System.out.println("The is m2 method in B interface");
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("The is m3 method in B interface");
	}

}
