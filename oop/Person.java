package rw.ac.rca.oop;

public class Person {
    String name;
    int age;
    float height;
    public Person(){
    }
    public Person(String name){
        this.name = name;
    }
    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }
    public Person(String name,int age,float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
