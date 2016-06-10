package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AufgabeMarcelBogutzki {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Geben sie Ihre Rente ein : ");
		String rente = br.readLine();
		double rente1 = Double.parseDouble(rente.trim());
		
		System.out.print("Geben sie Ihre Laufzeit ein : ");
		String laufzeit = br.readLine();
		int laufzeit1 = Integer.parseInt(laufzeit.trim());
		
		System.out.print("Geben sie Ihren Zinssatz in Prozent an : ");
		String prozent = br.readLine();
		double prozent1 = Double.parseDouble(prozent.trim());
		
		double q = 1 + prozent1;
		
		System.out.println("Endwert : "+ rente1 * (((Math.pow(q, laufzeit1) - 1) / (q - 1)) / 100));
		
		

	}

}
