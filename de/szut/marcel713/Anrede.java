package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anrede {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Vorname : ");
		String vorname = br.readLine();
		
		System.out.print("Nachname : ");
		String nachname = br.readLine();
		
		System.out.print("Geschlecht , 1 f¸r M‰nnlich , 2 f¸r Weiblich : ");
		String geschlecht = br.readLine();
		
		int zahl11 = Integer.parseInt(geschlecht.trim());
		if (zahl11 == 1) {
			System.out.println("Hallo Herr " + vorname + " " + nachname);
		}
		if (zahl11 == 2) {
			System.out.println("Hallo Frau " + vorname + " " + nachname);
			
		}
		if (zahl11 > 2) {
			System.out.println("Keine Ordnungsgem‰ﬂe Antwort");
		}
		if (zahl11 < 1) {
			System.out.println("Keine Ordnungsgem‰ﬂe Antwort");
		}

			
		
		
		

	}

}
