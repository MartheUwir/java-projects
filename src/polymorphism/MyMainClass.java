
package polymorphism;

class Livestock{
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}
class Cat extends  Livestock{
	public void animalSound() {
		super.animalSound();
		System.out.println("Dog says: bow bow");
	}
}
public class MyMainClass {
	public static void main(String args[]) {
		 Livestock myDog = new Cat();
		myDog.animalSound();
	}

}
