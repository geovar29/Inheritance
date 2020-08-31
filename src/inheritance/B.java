package inheritance;

public class B extends A{
	
	public void add(int a, int b)
	{
		super.add(5,5);
		System.out.println("this is add method");
	}

	public static void main(String[] args) {
		
		B b=new B(); //
		
		b.add(10, 20);
		
		A a=new A();
		
		a.add(10, 20);

	}

}
