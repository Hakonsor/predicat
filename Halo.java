public class Halo{ // Start of class

	// Data fields
	private double radius;

	// Constructor
	public Halo(double r) {
		if (radius < 0) {
			radius = 0;
		}
		else {
			radius = r;
		}

	} // End of constructor
	
	// set-methods
	public void setRadius(double r) {
		if (radius < 0) {
			radius = 0;
		}
		else {
			radius = r;
	}

	// get-methods
	public double getRadius() {
		return radius;
	}

	public double getDiameter() {
		return 2*radius;
	}

	public double getCircumference() {
		return 2*Math.PI*radius;
	}

	public double getArea() {
		return Math.PI*Math.pow(radius,2);
	}

	public String getData() {
		String text = "The circle's radius is: \n" + getRadius() + "The circle's diameter is: \n " 
					+ getDiameter()
					+ "The circle's circumference is: \n" + getCircumference() + "The circle's area is: \n" 
					+ getArea();
		return text
	}

} // End of class
