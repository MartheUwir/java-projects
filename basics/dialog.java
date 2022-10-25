import javax.swing.JOptionPane;
import java.util.Scanner;

public class dialog{
	public static void main(String[]args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, " Hello "+name);
		String home = JOptionPane.showInputDialog("Enter your Adress");
		JOptionPane.showMessageDialog(null, " You live at "+home);
		int phone = Integer.parseInt(JOptionPane.showInputDialog("Enter your phone number :"));
		JOptionPane.showMessageDialog(null, "Your phone number is "+phone);
		
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null,"You are"+age+" Years old");
	    double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight in kilograms"));
	    JOptionPane.showMessageDialog(null,"You have"+ weight+"Kg");
	
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height"));
		JOptionPane.showMessageDialog(null,"You are"+height+ " cm tall");
		
		String food = JOptionPane.showInputDialog("What is your favorite food ");
		JOptionPane.showMessageDialog(null," Really Like "+ food);
		
		JOptionPane.showMessageDialog(null," It was pleasure to meet you "+name+" See you! ");
		System.out.println("Entered name :"+name);
		System.out.println("You live at  :"+home);
		System.out.println("Your contact :"+phone);
		System.out.println("You are  :"+age+" Years old");
		System.out.println("You weigh  :"+weight+"Kgs");
		System.out.println("You are a"+" cm Tall");
		System.out.println("you like "+food);
	    System.out.println("Thank you"+ name+" For your information good bye see u");
	    System.out.println("");
	    
		
	}
}