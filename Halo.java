public class Halo{ // Start of class

	// Declaring private double data field radius
	private double radius;

	public Halo(double r) {
		if (radius < 0) {
			radius = 0;
		}
		else {
			radius = r;
		}
	}
} // End of
