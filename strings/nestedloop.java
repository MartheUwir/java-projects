package strings;
import java.util.Scanner; 

public class nestedloop {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		try (Scanner Scanner = new Scanner(System.in)) {
			int rows;
			int columns;
			String symbol = "";
			
			System.out.println("Enter # of rows: ");
			rows=Scanner.nextInt();
			System.out.println("Enter # of columns: ");
			columns=Scanner.nextInt();
			System.out.print("Enetr symbol to use: ");
			symbol =Scanner.next();
			
			for(int i=1; i<=rows; i++) {
				System.out.println();
				for(int j=1; j<=rows; j++) {
					System.out.print(symbol);
					  
				}
			}
		}
		
	}

}
