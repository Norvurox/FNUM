package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Berechnungen {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Was m�chten sie tun ? 'F' f�r Fakult�tberechnung 'Q' f�r Quadratsumme 'X' f�r Programm Beenden : ");
		String gibein = br.readLine();
		
		
		
		if (gibein.equalsIgnoreCase("F")) {
			System.out.print("Fakult�t von : ");
			String zahl = br.readLine();
			int number = Integer.parseInt(zahl.trim());
			
			int banane = 1;
			
			for(int i = 1; i <= number; i++) {
				banane = banane * i;
			}
			System.out.println("Fakult�t : "+ banane);
			return;
		}
		
		if (gibein.equalsIgnoreCase("Q")) {
			System.out.print("Quadratsumme von : ");
			String zahl = br.readLine();
			double number = Double.parseDouble(zahl.trim());
			
			double banane = 0;
			
			for(int i = 0; i <= number; i++) {
				banane = banane + Math.pow(i, 2);
			}
			System.out.println("Quadratsumme : " + banane);
			return;
		}
		
		if (gibein.equalsIgnoreCase("X")) {
			return;
		}
		else {
			System.out.println("Keine korrekte Angabe !");
			main(args);
		}
	}

}
