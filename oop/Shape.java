package rw.ac.rca.oop;

public class Shape {
    private int color;
    float area;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void  sayName(){
        System.out.println("I'm supper class");
    }

	public void sayYourType() {
		// TODO Auto-generated method stub
		
	}

	public void noRealTypeShapeSpecified(Class<? extends Shape> class1) {
		// TODO Auto-generated method stub
		
	}
}
