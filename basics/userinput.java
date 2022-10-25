import java.util.Scanner;
public class userinput{
	public static void main(String[] args) {
		 Scanner Scanner = new Scanner(System.in);
		 System.out.println("What is your name? ");
		 String name = Scanner.nextLine();
		
		 System.out.println("How old are you ?");
		 int age =     Scanner.nextInt();
		 Scanner.nextLine();
		 System.out.println("What is your favorite food?");
		 
		 String food = Scanner.nextLine();
		 
		 System.out.println("Hello dear "+name);
		 System.out.println("You are "+age);
		 System.out.println("You really like "+food);
		 
		Scanner.close();
		 
		
	}
} 