package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anrede2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Vorname : ");
		String vorname = br.readLine();

		System.out.print("Nachname : ");
		String nachname = br.readLine();

		System.out.print("Geschlecht , m f�r M�nnlich , w f�r Weiblich : ");
		String geschlecht = br.readLine();

		if (geschlecht.equals("m")) {
			System.out.println("Hallo Herr " + vorname + " " + nachname);
			return;
		}
		if (geschlecht.equals("w")) {
			System.out.println("Hallo Frau " + vorname + " " + nachname);
			return;
		}
		else {
			System.out.println("Keine Ordnungsgem��e Antwort");
		}



	}
}


