package de.szut.marcel713;

public class Niederschlag {

	public static void main(String[] args) {
		
		double April;
		double Mai;
		double Juni;
		double ergebnis1;
		
		April = 12;
		Mai = 14;
		Juni = 8;
		ergebnis1 = (April + Mai + Juni) / 3;
		
		System.out.println ("Durchschnitt 1 Schritt: " + ergebnis1);
		System.out.println ("Durchschnitt 2 Schritt: " + (April + Mai + Juni) / 3);
		
		
		

	}

}
