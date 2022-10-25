import java.util.Scanner;
public class condition{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age <17) {
			System.out.println("You are able to vote!");
		}else {
			System.out.println("You are Allowed to vote!");
		}
	
		scanner.close();
	}
}