package basics;

public class VariableExample4 {
	
	String name="Selenium";  //instance variable
	
	/*public VariableExample4()
	{
		
	}*/
	
	static int a=100;
	
	public void m1()
	{
		String name="Java";
		
		int a=1000;
		
		System.out.println(name);
		
		System.out.println(this.name);  //this keyword refer to global variable
		
		System.out.println(this.a);
		
		System.out.println(a);
	}
	
	public static void m2()
	{
		String name="testng";
		
		int a=2000;
		
		System.out.println(name);  // local variable
		
		VariableExample4 v4=new VariableExample4();
		
		System.out.println(v4.name);  // global variable
		
		System.out.println(a);
		
		System.out.println(v4.a);
		
		System.out.println(VariableExample4.a); // using classname.variablename
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		/*VariableExample4 v4=new VariableExample4();
		
		v4.m1();*/
		
		m2();
	}
	
		//static variable ---> instance method ---> direct
	
		//static variable ---> static method ---> direct, Object, classname 

		//instance variable ---> instance method ---> direct ,this
		
		//instance variable ---> static method ---> object

}
