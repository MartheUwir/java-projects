package strings;

public class threedarray {
	public static void main(String[] args) {
		String[][] cars = new String[3][3];
		cars[0][0]= "Comaro";
		cars[0][1]= "v8";
		cars[1][1]="rangi_rover";
		cars[1][2]="tesla";
		cars[2][2]="mustang";
		cars[2][0]="dinah";
		cars[2][1]="toyota";
		
		for (int i=0;i<cars.length;i++) {
			System.out.println();
			for(int j=0; j<cars[i].length;j++) {
				System.out.print(cars[i][j]);
			}
		}
		
			
		
	}

}
