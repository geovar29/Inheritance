package basics;

public class MethodOverloading {

	
	public void m1()
	{
		System.out.println("no argument");
	}
	
	public String m1(String name)
	{
		return name;
	}
	
	public int m1(int a, int b)
	{
		int c=a+b;
		
		return c;
	}
	
	public float m1(float a)
	{
		return a;
	}
	
	public int m1(int a)
	{
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m=new MethodOverloading();
		
		String res;
		
		res=m.m1("Java");
		
		System.out.println(res);
		
		
		float res1;
		
		res1=m.m1(10.5f);
		
		System.out.println(res1);
		
		 res1=m.m1(45, 45);
		 
		 System.out.println(res1);
		

	}

}
