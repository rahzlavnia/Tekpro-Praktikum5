
public final class Circle extends Shape {
	private double radius;
	
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double r) {
		radius = r;
	}
	
	public Circle(double r, String c, boolean f) {
		super(c,f);
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		 return radius*radius*Math.PI;
	}
	 
	public double getPerimeter() {
		return Math.PI*(radius+radius);
	}
	
	public String toString() {
		  return "\nA Circle with radius="
				  +radius+", which is a subclass of "+ super.toString();
	 }
}

