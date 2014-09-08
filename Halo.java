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

} // End of
