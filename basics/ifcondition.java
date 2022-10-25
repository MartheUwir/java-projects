import java.util.Scanner;
public class ifcondition{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your age ");
		int age = scanner.nextInt();
		
		if (age >17) {
			System.out.println("You are able to vote!");
		}else {
			System.out.println("You are not Allowed to vote!");
		}
		
		scanner.close();
	}
} 