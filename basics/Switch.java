
import java.util.Scanner;
public class Switch{
	public static void main(String []args) {
		String day = "thursday";  
		
	Scanner Scanner = new Scanner(System.in);
	System.out.println("Enter the day we are on , simply Today:");
	String day1 = Scanner.nextLine();
	System.out.println("Today we are on "+day1);
	switch (day1) {
	case "sunday": System.out.println("Its sunday let's go to pray!");
	break;
	case "monday": System.out.println("Its monday let's plan for this new week!");
	break;
	case "tuesday": System.out.println("Its tuesday am planning to go swimming");
	break;
	case "wednesday": System.out.println("Its wednesday lets have some fun!");
	break;
	case "thursday": System.out.println("Today is thursday pope we are gonna sulf, waves are so good as i can see");
	break;
	case "friday": System.out.println("We are not only goig to pray but eating chips");
	break;
	case "saturday": System.out.print("am tired and this week was so tiresome but somehow funny");
	break;
	default: System.out.println("That is not a day");
	 
	}
	
	}	 
}