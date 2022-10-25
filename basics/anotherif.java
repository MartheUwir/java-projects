
import java.util.Scanner;
public class anotherif{
	public static void main(String[] args) {
		
		Scanner Scanner=new Scanner(System.in);
		System.out.print("You are playing a game ! Press q or Q to quit ");
		String response = Scanner.next();
		
		if(response.equals("q")|| response.equals("Q")) {
			System.out.println("You quit the game");
		}
		
		
	}
	
}