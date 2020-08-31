package polymorphism;

public class Methodoverriding2 extends Methodoverriding {
	
	int a=100, b=200, c;
	
	public void add()
	{
		c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		/*Methodoverriding2 m=new Methodoverriding2();
		
		m.add();  //current class method 
		
		Methodoverriding m1=new Methodoverriding();
		
		m1.add(); // parent class method*/
		
		
		Methodoverriding m2=new Methodoverriding2();
		
		m2.add();

	}

}
