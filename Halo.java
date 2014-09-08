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
	
	setRadius(double r) {
		if (radius < 0) {
			radius = 0;
		}
		else {
			radius = r;
	}

} // End of
