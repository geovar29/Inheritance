package basics;

public class Blocks {
	
	
	//instance block
	{
		System.out.println("This instance block");
	}
	
	Blocks()  //Constructor
	{
		System.out.println("This is constructor");
	}
	
	
	static
	{
		System.out.println("This is static block");
	}

	public static void main(String[] args) 
	{
		Blocks b=new Blocks();

	}

}
