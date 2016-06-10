package de.szut.marcel713;

public class Grundrechenarten {

	public static void main(String[] args) {
		//Variablen für Zahlen
		double zahl1 = 67.89;
		double zahl2 = 34.56;
		//Ergebnisse
		double summe = zahl1 + zahl2;
		double differenz = zahl1 - zahl2;
		double produkt = zahl1 * zahl2;
		double quotient = zahl1 / zahl2;
		//Rechnungen
		System.out.println ("Zahl X: 67.89");
		System.out.println ("Zahl Y: 34.56");
		System.out.println ("Summe: " + summe);
		System.out.println ("Differenz: " + differenz);
		System.out.println ("Produkt: " + produkt);
		System.out.println ("Quotient: " + quotient);
		System.out.println ("Potenzieren: " + Math.pow(zahl1, zahl2));
		System.out.println ("Wurzel aus X " + Math.sqrt(67.89));
		System.out.println ("Wurzel aus Y " + Math.sqrt(34.56));


	}

}
