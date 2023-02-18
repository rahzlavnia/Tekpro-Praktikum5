
public class Rectangle extends Shape{
	double width;
	double length;
	
	public Rectangle() {
		width = 1.0;
		length = 1.0;
	}
	
	public Rectangle(double w, double l) {
		width = w;
		length = l;
	}
	
	public Rectangle(double w, double l, String c, boolean f) {
		super(c,f);
		width = w;
		length = l;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		 return this.width*this.length;
	}
	
	public double getPerimeter() {
		return 2*(this.width+this.length);
	}
	
	public String toString() {
		  return "A Rectangle with [width=" + width + " and length="
				  +length+"],\nwhich is a subclass of " + super.toString();
	 }
	
}

