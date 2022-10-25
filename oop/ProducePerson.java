package rw.ac.rca.oop;
public class ProducePerson {
    public static void  main (String[] args){
        Person person1 = new Person("Ruth",17);
        Person person2 = new Person("Marthe",54,450.7f);

        System.out.println("Produced person one is: " + person1.name + " " + person1.age);
        System.out.println("Produced person two is: " + person2.name + " " + person2.age + " " + person2.height);
    }
}
