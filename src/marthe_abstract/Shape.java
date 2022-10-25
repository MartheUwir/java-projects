package marthe_abstract;

public abstract class Shape {
	
	
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
	    };

	    public abstract void  sayName();
	}
   


