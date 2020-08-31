package Multilevel;

public class B extends A{
	
	String name="George";
	
	static int a=2000;
	
	public void m1()
	{
		System.out.println(this.name); // george
		
		System.out.println(super.name);// praneed
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
