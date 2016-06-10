package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alterspruefung2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		System.out.print("Wie Alt bist du ? : ");
		String input = br.readLine();
		
		int alter = Integer.parseInt(input.trim());
		
		if (alter < 16 && alter >= 14) {
			System.out.println("Mit "+ alter +" bist du noch Minderjährig.");
			System.out.println("Du darfst Mofa fahren , aber nicht Moped.");
		}
		else if (alter >= 18) {
			System.out.println("Mit "+ alter +" bist du schon Volljährig.");
			System.out.println("Du darfst Auto fahren.");
		}
		else if (alter < 14) {
			System.out.println("Mit "+ alter +" bist du noch ein Kind.");
			System.out.println("Du darfst noch kein Mofa fahren.");
		}
		else if (alter < 18 && alter >= 16) {
			System.out.println("Mit "+ alter +" bist du noch Minderjährig.");
			System.out.println("Du darfst Moped fahren , aber kein Auto.");
		}
		
		

	}

}
