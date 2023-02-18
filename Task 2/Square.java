
public final class Square extends Rectangle {
	
	public Square() {
		super.setWidth(1.0);
		super.setLength(1.0);
	}
	
	public Square(double s) {
		super(s,s);
	}
	
	public Square (double s, String c, boolean f) {
		super(s,s,c,f);
	}

	public void setWidth(double side) {
		super.setWidth(side);
	}

	public void setLength(double side) {
		super.setLength(side);
	}

	public String toString() {
		 return "\nA Square with side="+super.width+", which is subclass of " 
				 + super.toString();
	}
	
}

