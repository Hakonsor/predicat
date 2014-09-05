// Dette er applikasjonens main-fil. Den inneholder main-metoden.
import javax.swing.JOptionPane;

public class HeltallSummeringMain {
  
  public static void main(String[] args) { // Start, main-metoden.
  
    // Lager objekt av JOptionPane for mer oversiktlig kode.
    JOptionPane j = new JOptionPane();
    
    // Deklarer variabler.
    long nedre, øvre, sum;
    boolean godkjent;
    
    while (øvre <= nedre) {
      j.showMessageDialog(null, "Øvre grensetall må være større enn nedre grensetall.");
      nedre = Long.parseLong(j.showInputDialog("Les inn nytt heltall som nedre grense: "));
      øvre = Long.parseLong(j.showInputDialog("Les inn nytt heltall som øvre grense: "));
    }
    
    System.out.println("While løkken ble kjørt.") // Debug, sjekker om while-løkken ble ferdig.
    
    for(long i = nedre-1; i >= øvre; i++){
      sum += i;
      
    }
    
    
  } // Slutt, main-metoden.
  
} // Slutt, HeltallSummeringMain.
