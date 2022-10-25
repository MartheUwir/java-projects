
import java.util.Scanner;

public class inputrev{
	
	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("What is your name "); 
		
		String name = Scanner.nextLine();
		
		System.out.println("How old are you");
		
		int age = Scanner.nextInt();
		
		System.out.println("Your name is "+name);

		System.out.print("You are " +age);
		Scanner.close();
		
	}
}