package basics;

public class ConditionalStatements {
	
	//if , if , else  if, else if, else
	
	//Switch case

	public static void main(String[] args) {
		
		
		int stuMark=45;
		
		  
		if(stuMark==50)
		{
			System.out.println("just pass");
		}
		
		          
		else if(stuMark>50 && stuMark<=60)
		{
			System.out.println("Second class");
		}
		
		else if(stuMark>60 && stuMark<=70)
		{
			System.out.println("First class");
		}
		
		else if(stuMark>70 && stuMark<=80)
		{
			System.out.println("Good");
		}
		
		else if(stuMark>80 && stuMark<=90)
		{
			System.out.println("Very Good");
		}
		
		else if(stuMark>90 && stuMark<=100)
		{
			System.out.println("Excellent");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
