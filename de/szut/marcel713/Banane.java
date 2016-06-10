package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banane {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Geben sie 1-5 für Serhat ein und 6-11 für Marcel: ");
		String orusbucocugu = br.readLine();
		
		int orusbuevladi = Integer.parseInt(orusbucocugu.trim());
		
		if (orusbuevladi > 0 && orusbuevladi <= 5) {
			System.out.println("Serhat Ikilik");
		}
		else if (orusbuevladi > 5 && orusbuevladi <= 11) {
			System.out.println("Marcel Bogutzki");
		}
		
		else {
			System.out.println("Falsche Eingabe!");
			main(args);
		}
		
	}

}
