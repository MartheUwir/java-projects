package rw.ac.rca.oop;

public class Rectangle extends Shape{
    private float width;
    private float height;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    public float calculateAre(float length , float width) {
		 return length* width; 
	 }
}
