import javax.swing.JOptionPane;

public class HaloMain {

  public static void main(String... args) {
  	JOptionPane j = new JOptionPane();

  	double r = setRadius(Double.parseDouble(j.showInputdialog("What is the radius of your circle?")));

  } // Slutt på main-metoden
} // Slutt på HaloMain
