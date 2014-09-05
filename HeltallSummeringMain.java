// Dette er applikasjonens main-fil. Den inneholder main-metoden.
import javax.swing.JOptionPane;

public class HeltallSummeringMain {
  
  public static void main(String[] args) { // Start, main-metoden.
  
    // Lager objekt av JOptionPane for mer oversiktlig kode.
    JOptionPane j = new JOptionPane();
    
    // Deklarer variabler.
    long nedre, øvre, tall, sum;
    String tekst = "";
    while (øvre <= nedre) {
      j.showMessageDialog(null, "Øvre grensetall må være større enn nedre grensetall.");
      nedre = Long.parseLong(j.showInputDialog("Les inn nytt heltall som nedre grense: "));
      øvre = Long.parseLong(j.showInputDialog("Les inn nytt heltall som øvre grense: "));
    }
    
    System.out.println("While løkken ble kjørt.") // Debug, sjekker om while-løkken ble ferdig.
    
    for (long i = (nedre-1); i == øvre; i++){ // Start, for-løkke.
      if (i + 1 == øvre) { // Start, slutt-test som legger til sum i strengen.
        sum += i;
        tekst += i + " = " + sum;
      }
      else { // Sørger for at man ser hvilke tall som blir lagt sammen før summen.
        tekst += (i + " + "); 
        sum += i;
        for (int k = 0; k==10; k++) { // Sørger for at det blir printet en ny linje i teksten hvert tiende tall.
          tekst += "\n";
        }
      }
    }
    
    
    
  } // Slutt, main-metoden.
  
} // Slutt, HeltallSummeringMain.
