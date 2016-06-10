package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rechner {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		System.out.print("Geben sie die erste Zahl ein : ");
		String zahl1 = br.readLine();
		System.out.print("Geben sie die zweite Zahl ein : ");
		String zahl2 = br.readLine();
		
		
		
		int zahl11 = Integer.parseInt(zahl1.trim());
		
		int zahl22 = Integer.parseInt(zahl2.trim());
		
		
		
		System.out.println("Summe : " + (zahl11 + zahl22));
		System.out.println("Differenz : " + (zahl11 - zahl22));
		System.out.println("Produkt : " + (zahl11 * zahl22));
		System.out.println("Quotient : " + (zahl11 / zahl22));
		System.out.println("Potenz : " + (Math.pow (zahl11 , zahl22)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
