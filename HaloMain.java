import javax.swing.JOptionPane;

public class HaloMain {

  public static void main(String... args) {
  	JOptionPane j = new JOptionPane();
  	Halo s = new Halo(Double.parseDouble(j.showInputdialog("What is the radius of the circle?")));
  } // Slutt på main-metoden
} // Slutt på HaloMain
