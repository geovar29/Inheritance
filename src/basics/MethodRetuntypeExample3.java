package basics;

public class MethodRetuntypeExample3 { // accessmodifier --> public, private, default, protected
	
	
	public void m1()
	{
		System.out.println("This method return nothing");
	}
	
	public String getName()
	{
		return "java";
	}
	
	public int add(int a, int b)
	{
		int c=a+b;
		
		return c;
		
	}
	
	public float sub(float a, float b)
	{
		float c=a-b;
		
		return c;
	}

	public static void main(String[] args) {
		
		MethodRetuntypeExample3 v3=new MethodRetuntypeExample3();
		
		int result=v3.add(10, 20);
		
		System.out.println(result);
		
		String str=v3.getName();
		
		System.out.println(str);
		
		v3.m1();
		
		float rs=v3.sub(10.5f, 10.5f);
		
		System.out.println(rs);

	}

}
