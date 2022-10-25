package tutorial;
class Doctor{
	float salary =50000;
}
class Surgeon extends Doctor {
	float bonus=20000;
} 
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Surgeon s= new Surgeon();
		System.out.println("Salary of Surgeon :"+s.salary);
		System.out.println("bonus of Surgeon :"+s.bonus);
	}

}
