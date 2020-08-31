package basics;

public class Test {
	
	int stuid;       //instance variable
	
	String stuName;
	
	static String collegeName="SRM"; //static variable
	
	                     
	Test(int stuid, String stuName)  
	{
		this.stuid=stuid;
		
		this.stuName=stuName;
	}
	
	public static void m1()
	{
		
		System.out.println("Welcome");
	}
	
	public void getData()
	{
		m1();
		System.out.println("The Student id is : "+ stuid);
		System.out.println("The Student Name is : "+ stuName);
		System.out.println("The College Name is :"+ collegeName);
		System.out.println();
		System.out.println("----------------");
		System.out.println();
	}

	public static void main(String[] args) {
		
		Test t1=new Test(1, "Ram");

		t1.getData();
		
		Test t2=new Test(2, "Ramesh");
		
		t2.getData();
		
		Test t3=new Test(3, "Ragul");
		
		t3.getData();
	}

}
