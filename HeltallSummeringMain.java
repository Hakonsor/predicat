// Dette er applikasjonens main-fil. Den inneholder main-metoden.

// Importerer klassebibliotek for å bruke vindusmetoder:
import javax.swing.JOptionPane;

// Deklarerer klassen:
public class HeltallSummeringMain {

  public static void main(String[] args) { // Start, main-metoden.

    // Lager objekt av JOptionPane for mer oversiktlig kode.
    JOptionPane j = new JOptionPane();

    // Deklarer variabler:
    long nedre, øvre, tall, sum = 0;
    String tekst = "";

    // Ber om heltall for øvre og nedre grenseverdier:
    nedre = Long.parseLong(j.showInputDialog("Les inn heltall som nedre grense: "));
    øvre = Long.parseLong(j.showInputDialog("Les inn heltall som øvre grense: "));

    // Undersøker om øvre grenseverdi er mindre enn nedre grenseverdi.
    while (øvre <= nedre) {
      j.showMessageDialog(null, "Øvre grensetall må være større enn nedre grensetall.");
      nedre = Long.parseLong(j.showInputDialog("Les inn nytt heltall som nedre grense: "));
      øvre = Long.parseLong(j.showInputDialog("Les inn nytt heltall som øvre grense: "));

      System.out.println("while has been executed \n");
    }

    // Løkke for å lage String med tekst og sum:
    for (long i = nedre; i < (øvre + 1); i++) {

      System.out.println("for has been started \n");

      // Sørger for at man ser hvilke tall som blir lagt sammen før summen.
			if (!(i == øvre)) {
	  		tekst += (i + " + ");
	      sum += i;
	      for (int k = 0; k==10; k++) { // Sørger for at det blir printet en ny linje i teksten hvert tiende tall.
	        tekst += "\n";
	        
	        System.out.println("for for fuck's sake \n");
	      }
			}
	      System.out.println("if has been run at least once \n");
	     
	    System.out.println("if has finished \n");
	     
	      // Slutt-test som legger til sum i strengen.
	    else {
	      sum += i;
				tekst += i + " = " + sum;
	
	      System.out.println("else has been run at least once \n");
	        
	    } // end of else
	    } // Slutt på løkke for å lage String med tekst og sum.

    // Printer resultatet i vindu:
    j.showMessageDialog(null,tekst);

    System.out.println("newline");

  } // Slutt, main-metoden.

} // Slutt, HeltallSummeringMain.
