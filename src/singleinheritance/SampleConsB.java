package singleinheritance;

public class SampleConsB extends SampleConsA{
	
	public SampleConsB()
	{
		super();
		System.out.println("This is first constructor in current class");
	}
	
	public SampleConsB(String name)
	{
		this();
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		
      SampleConsB b=new SampleConsB("java");
      
      SampleConsA a=new SampleConsA();
	}

}
