package multipleinheritance;

public class Imple implements InterA , InterB ,InterC
{

	public static void main(String[] args) 
	{
		
         
	}

	@Override
	public void mul() {
		
		System.out.println("This is mul method");
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
		System.out.println("This is div method");
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("This is add method");
	}

	@Override
	public void sub() {
		
		System.out.println("This is sub method");
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
		System.out.println("This is getTitle method");
		
	}

}
