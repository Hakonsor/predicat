/*Nedenfor ser du en skisse av hovedprogrammet
som du skal bruke til å teste ut klassen Sirkel.
Din oppgave er også her å erstatte pseudokoden med java-instruksjoner. >*/

import javax.swing.JOptionPane;
//<  nødvendig(e) import-setning(er) >
public class SirkelTest
{
  public static void main(String[] args)
  {
	  double radius, sum = 0, gjennomsnitt = 0;

	  int d = JOptionPane.YES_NO_OPTION;// extra setting ikke en del av psudokoden

	//<  Les inn sirkelens radius fra brukeren. >

	do{

	radius = Double.parseDouble("0"+JOptionPane.showInputDialog(null,"Skriv inn Sirkelen radius"));



	if(radius > 0){// "Så lenge radius er positiv:"
		Sirkel r = new Sirkel(radius);
		sum += radius;
		gjennomsnitt++;
		JOptionPane.showMessageDialog(null, r.sirkelTekst());
		JOptionPane.showMessageDialog(null,"Gjennomsnitt av innlest Radius: "+(sum/gjennomsnitt));
	}
	else{
		JOptionPane.showMessageDialog(null, "Ugjyldig innlesning");
	}

		JOptionPane.showConfirmDialog(null, "Har du lyst til å fortsette programmet?", "Psudokoden sa ingenting om å avslutte programmet", d);

	}while(d == JOptionPane.YES_OPTION);

/*

    <  Så lenge radius er positiv:
       Opprett et Sirkel-objekt, som ved opprettelsen blir tilført
       den radius som brukeren har skrevet inn.
       Summer radiusene ettehvert som de leses inn.
       Skriv sirkelens radius, diameter, omkrets og areal ut på skjermen
       ved å bruke en eller flere metoder i Sirkel-klassen.
       Les inn sirkelens radius på nytt fra brukeren. >

   <  Skriv ut den gjennomsnittelige radiusen for de innleste sirkelene.
      Hvis det ikke er lest inn noen skal programmet gi beskjed om det. >
*/
  }
} // end of class SirkelTest

/*Innlesing av radius og utskrift av radius, diameter,
omkrets og areal skal foretas gjentatte ganger,
inntil det leses inn en verdi som gjør betingelsen usann.
Bruk dialogvinduer til både innlesing og utskrift.
(Utskrift av radius, diameter, omkrets og areal kan gjøres i en og samme dialogvindu.)
NB! Klassene må skrives på hver sin fil.
Opprett en mappe som heter Sirkel, og legg begge filene i den.*/