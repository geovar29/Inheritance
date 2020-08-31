package Abstraction;

public class Test {

	public static void main(String[] args) {
		
		Sample s=new SampleLogic(); //dynamic polymorphism
		
		int result=s.add(100, 200);
		
		System.out.println(result);
		
		System.out.println(s.add(10.5f, 25.5f));
		
		System.out.println(s.mul(5, 5));
		
		s.div();
		
		s.s1();

	}

}
