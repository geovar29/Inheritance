package basics;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String weekday="Jan";
		
		switch(weekday)
		{
		
		
		case "Sun":
			System.out.println("This is sun");
			break;
			
		case "Mon":
			
			 System.out.println("This is mon");
			 break;
			 
		case "Tue":
			
			 System.out.println("This is tue");
		     break;
		     
		case "Wed":
			
			 System.out.println("This is wed");
			 break;
			 
		case "Thu":
			
			 System.out.println("This is thu");
			 break;
			 
		case "Fri":
			
			 System.out.println("This is Fri");
			 break;
			 
		case "Sat":
			
			 System.out.println("This is sat");
			 break;
			 
		default:
			System.out.println("Please Enter the valid week days");
		
		}

	}

}
