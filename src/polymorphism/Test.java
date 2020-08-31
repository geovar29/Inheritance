package polymorphism;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBI r=new ICICI();
		
		String icici=r.getinterestrate();
		
		System.out.println(icici);
		
		
		RBI r1=new SBI();
		
		String sbi=r1.getinterestrate();
		
		System.out.println(sbi);
		
		

	}

}
