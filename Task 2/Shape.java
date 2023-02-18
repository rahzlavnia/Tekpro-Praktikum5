
public abstract class Shape {
	private String color;
	private boolean filled;
	
	public Shape() { // 1st (default) constructor
		 color = "green";
		 filled = true;
	 }
	
	public Shape(String c, boolean f) { // 2nd constructor
		 color = c;
		 filled = f;
	 }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
		convertFilled(filled);
	}

	public String convertFilled(boolean f) {
		if (f==true) {
			return "filled";
		}else {
			return "not filled";
		}
	}
	
	public String toString() {
		  return "A Shapes with [color of " + color + " and " 
				  + this.convertFilled(isFilled()) + "]";
	 }
}

