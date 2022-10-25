package rw.ac.rca.oop;

public class Circle extends  Shape{
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void mySpecificName(){
        System.out.println("I am specifically a circle");
    }
    
}

