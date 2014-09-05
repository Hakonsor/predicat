// Dette er applikasjonens main-fil. Den inneholder main-metoden.
import javax.swing.JOptionPane;

public class HeltallSummeringMain {
  
  public static void main(String[] args) { // Start, main-metoden.
  
    // Lager objekt av JOptionPane for mer oversiktlig kode.
    JOptionPane j = new JOptionPane();
    
    // Deklarer variabler:
    long nedre, øvre, tall, sum;
    String tekst = "";
    
    // Ber om heltall for øvre og nedre grenseverdier:
    nedre = j.showInputDialog("Hva er den nedre " ) 
    øvre = j.showInputDialog("Hva er den øvre " )
    while (øvre <= nedre) { // Undersøker om øvre grenseverdi er mindre enn nedre grenseverdi.
      j.showMessageDialog(null, "Øvre grensetall må være større enn nedre grensetall.");
      nedre = Long.parseLong(j.showInputDialog("Les inn nytt heltall som nedre grense: "));
      øvre = Long.parseLong(j.showInputDialog("Les inn nytt heltall som øvre grense: "));
    }
    
    // Løkke for å lage String med tekst og sum:
    for (long i = (nedre-1); i == øvre; i++){
    
      // Slutt-test som legger til sum i strengen.
      if (i + 1 == øvre) { 
        sum += i;
        tekst += i + " = " + sum;
      }
      
      // Sørger for at man ser hvilke tall som blir lagt sammen før summen.
      else { 
        tekst += (i + " + "); 
        sum += i;
        for (int k = 0; k==10; k++) { // Sørger for at det blir printet en ny linje i teksten hvert tiende tall.
          tekst += "\n";
        }
      } 
    } // Slutt på løkke for å lage String med tekst og sum.
    
    
    
    
  } // Slutt, main-metoden.
  
} // Slutt, HeltallSummeringMain.
