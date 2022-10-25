package strings;

public class twodarray {
 public static void main(String[] args) {
	 
	 String [][] cars ={ { "toyota","rangi_rover","dinah"},
                        {"v8","Tesla","daihatsu"},
                        {"cosmos","meta","taxi"},
 };
	 for(int i=0;i<cars.length;i++) {
		 System.out.println();
		 for(int k=0; k<cars.length;k++) {
		System.out.println(cars[i][k]+" ");    
	 }
}
	 }
}