public class Halo{ // Start av klassen

	// Declaring private double data field radius
	private double radius;

	// Start of constructor
	public Halo(double r) {
		if (radius < 0) {
			radius = 0;
		}
		else {
			radius = r;
		}

	} // End of constructor
	
	// Create setRadius method
	public void setRadius(double r) {
		if (radius < 0) {
			radius = 0;
		}
		else {
			radius = r;
	}

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
		text = "The circle's radius is: \n" + getRadius() + "The circle's diameter is: \n " + getDiameter()
				+ "The circle's circumference is: \n" + getCircumference() + "The circle's area is: \n" 
				+ getArea();
	}

} // End of
