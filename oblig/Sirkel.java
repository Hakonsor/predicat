/* Nedenfor ser du en skisse i pseudokode av klassen Sirkel.
Din oppgave er å erstatte pseudokoden med java-instruksjoner.
NB! Pass på at du velger riktig aksess-form (private eller public)
for datafelt og metoder.*/

public class Sirkel
{

    private double radius;

    public Sirkel(double radius){
	 	setRadius(radius);
 	}

	public void setRadius(double radius){
		if(radius < 0)
			{this.radius = 0;}
			else
	 		{this.radius = radius;}
	}

	public double getRadius(){
		return radius;
	}

	public double calcDiameter(){
		return radius*2;
	}

	public double calcOmkrets(){
		return 2*Math.PI*radius;
	}

	public double calcAreal(){
		if(radius < 0){radius = 0;}
		return Math.PI*radius*radius;
	}
	public String sirkelTekst(){
		return (
			"Sirkelens radius: "+radius+
			"\nSirkelens Diameter: "+calcDiameter()+
			"\nSirkelens Omkrets: "+calcOmkrets()+
			"\nSirkelens Areal: "+calcAreal());

		}
	/*

	<  Konstruktør som skal gi startverdi til sirkelens radius.
       NB! Hvis startverdien er negativ, skal radius settes til 0. >


 	<  set-metode for sirkelens radius.
      NB! Hvis parameterverdien er negativ, skal radius settes til 0. >
  	<get-metode for sirkelens radius.  >
	<  Metode som beregner og returnerer sirkelens diameter.  >

    <  Metode som beregner og returnerer sirkelens omkrets.  >

    <  Metode som beregner og returnerer sirkelens areal.  >

    <  Metode som returnerer en tekst som inneholder  sirkelens radius,
       diameter, omkrets og areal. NB! Du SKAL bruke klassens metoder
       for å beregne disse verdiene. >
       */

} // end of class Sirkel end of class SirkelTest