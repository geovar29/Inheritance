package Multilevel;

public class C extends B{
	
	String name="Sugumar";
	
	static int a=3000;
	
	public void a1()  // isntance variable to instance method
	{
		String name="java";
		
		System.out.println(name); //java
		
		System.out.println(this.name); // sugumar
		
		System.out.println(super.name); //Geogre
		
		A ab=new A();
		
		System.out.println(ab.name); //praneed
	}
	
	public static void a2() //static variable to static method
	{
		System.out.println(C.a); //3000
		
		System.out.println(B.a);//2000
		
		System.out.println(A.a); //1000
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C cb=new C();
		
		cb.a1();
		
		a2();

	}

}
