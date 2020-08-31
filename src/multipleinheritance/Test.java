package multipleinheritance;

public class Test {

	public static void main(String[] args) {
		
	InterA finter=new Imple();
	
	finter.add();
	
	finter.sub();
	
	InterB sinter=new Imple();
	
	sinter.div();
	
	sinter.mul();
	
	InterC tinter=new Imple();
	
	tinter.getTitle();
	
	Imple in=new Imple();
	
	in.add();
	
	in.sub();
	
	in.div();
	
	in.mul();
	
	in.getTitle();

	}

}
