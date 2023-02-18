
public class Test {

	public static void main(String[] args) {
			Circle c1 = new Circle();
			System.out.println("Circle1 :"
					 + " \nradius=" + c1.getRadius()
					 + " \nbase area=" +c1.getArea()
					 + " \nperimeter=" +c1.getPerimeter()
					 + c1.toString());

			Circle c2 = new Circle(14.0);
			System.out.println("\nCircle2 :"
					 + " \nradius=" + c2.getRadius()
					 + " \nbase area=" +c2.getArea()
					 + " \nperimeter=" +c2.getPerimeter()
					 + c2.toString());
			
			Circle c3 = new Circle(7.0, "blue", false);
			System.out.println("\nCircle2 :"
					 + " \nradius=" + c3.getRadius()
					 + " \nbase area=" +c3.getArea()
					 + " \nperimeter=" +c3.getPerimeter()
					 + c3.toString());
			
			Rectangle r1 = new Rectangle();
			System.out.println("\nRectangle1 :"
					 + " \nwidth=" + r1.getWidth()
					 + " \nlength=" + r1.getLength()
					 + " \nbase area=" +r1.getArea()
					 + " \nperimeter=" +r1.getPerimeter()
					 + " \n" + r1.toString());
			
			Rectangle r2 = new Rectangle(2,3);
			System.out.println("\nRectangle2 :"
					 + " \nwidth=" + r2.getWidth()
					 + " \nlength=" + r2.getLength()
					 + " \nbase area=" +r2.getArea()
					 + " \nperimeter=" +r2.getPerimeter()
					 + " \n" + r2.toString());
			
			Rectangle r3 = new Rectangle(5,10,"white", false);
			System.out.println("\nRectangle3 :"
					 + " \nwidth=" + r3.getWidth()
					 + " \nlength=" + r3.getLength()
					 + " \nbase area=" +r3.getArea()
					 + " \nperimeter=" +r3.getPerimeter()
					 + " \n" + r3.toString());
					 
			Square s1 = new Square();
			System.out.println("\nSquare1 :"
					 + " \nside=" + s1.getWidth()
					 + " \nbase area=" +s1.getArea()
					 + " \nperimeter=" +s1.getPerimeter()
					 + s1.toString());
			
			Square s2 = new Square(2.0);
			System.out.println("\nSquare2 :"
					 + " \nside=" + s2.getWidth()
					 + " \nbase area=" +s2.getArea()
					 + " \nperimeter=" +s2.getPerimeter()
					 + s2.toString());
			
			Square s3 = new Square(5.0, "black", false);
			System.out.println("\nSquare3 :"
					 + " \nside=" + s3.getWidth()
					 + " \nbase area=" +s3.getArea()
					 + " \nperimeter=" +s3.getPerimeter()
					 + s3.toString());
	}

}

