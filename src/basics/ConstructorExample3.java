package basics;

public class ConstructorExample3 {
	
	public ConstructorExample3()  //user define constructor
	{
		this(10);
		System.out.println("This is first constructor");
	}
	
	public ConstructorExample3(int a)
	{
		System.out.println("This is second consstructor :"+ a);
	}
	
	public ConstructorExample3(String str, String str1, String str2)
	{
		this();
		System.out.println(str+ "  "+ str1 + "  "+str2);
	}
	
	public ConstructorExample3(float a)
	{
		this("Java","Selenium","TestNG");
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ConstructorExample3(10.5f);
		
		
	}

}
