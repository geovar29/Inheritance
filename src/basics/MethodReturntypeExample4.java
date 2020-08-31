package basics;

public class MethodReturntypeExample4 {
	
	public int add1()
	{
		int  b=500;
		
		MethodRetuntypeExample3 v3=new MethodRetuntypeExample3();
		
		int a=v3.add(20, 50); //70
		
		int c=a+b;  //70+500
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodReturntypeExample4 v4=new MethodReturntypeExample4();
		
		int res=v4.add1();
		
		System.out.println(res);
		
		
	}
}
