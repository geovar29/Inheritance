package basics;

public class ConstructorExample2 {
	
	public ConstructorExample2()  //user define constructor
	{
		System.out.println("This is first constructor");
	}
	
	public ConstructorExample2(int a)
	{
		System.out.println("This is second consstructor :"+ a);
	}
	
	public ConstructorExample2(String str, String str1, String str2)
	{
		System.out.println(str+ "  "+ str1 + "  "+str2);
	}
	
	public ConstructorExample2(float a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ConstructorExample2(20);
		
		new ConstructorExample2("java","Selenium", null);
		
		new ConstructorExample2(100.5f);
		
		new ConstructorExample2();
		
		
	}

}
