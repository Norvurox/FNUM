package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe2MarcelBogutzki {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
		
		System.out.print("Geben sie Ihren Nettoauftragswert ein : ");
		String netto = br.readLine();
		double netto1 = Double.parseDouble(netto.trim());
		
		if (netto1 < 100) {
			System.out.println("Netto : "+ netto1 +"€");
			System.out.println("Brutto : "+ (netto1 * 1.19) +"€");
			System.out.println("Porto und Verpackung : "+ 8.50 +"€");
			System.out.println("Gesamtpreis mit Porto : "+ ((netto1 * 1.19) + 8.50) +"€" );
		}
		else if (netto1 >= 100 && netto1 < 200) {
			System.out.println("Netto : "+ netto1 +"€");
			System.out.println("Brutto : "+ (netto1 * 1.19) +"€");
			System.out.println("Porto und Verpackung : "+ 5.00 +"€");
			System.out.println("Gesamtpreis mit Porto : "+ ((netto1 * 1.19) + 5.00) +"€" );
		}
		else if (netto1 >= 200) {
			System.out.println("Netto : "+ netto1 +"€");
			System.out.println("Brutto : "+ (netto1 * 1.19) +"€");
			System.out.println("Porto und Verpackung : "+ 0.00 +"€");
			System.out.println("Gesamtpreis mit Porto : "+ ((netto1 * 1.19) + 0.00) +"€" );
		}

	}

}
