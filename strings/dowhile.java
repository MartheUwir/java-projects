 package strings;
import java.util.Scanner;


public class dowhile {
	public static void main(String[] args) {
		Scanner Scanner= new Scanner (System.in);
		String name = "";
		do {
			System.out.print("Enter your name: ");
			name = Scanner.nextLine(); 
		}while(name.isBlank());
		
		
		
		
		System.out.println("Hello " +name);
		
		
	}

}
