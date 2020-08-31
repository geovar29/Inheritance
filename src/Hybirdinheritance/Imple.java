package Hybirdinheritance;

public class Imple implements B, C
{

	@Override
	public void car() {
		
		System.out.println("This method is in A interface");
		
	}

	@Override
	public void scooter() {
		
		System.out.println("This method is in C interface");
		
	}

	@Override
	public void bike() {
		
		System.out.println("This method is in B interface");
		
	}

	

}
