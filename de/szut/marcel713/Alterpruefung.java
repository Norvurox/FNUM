package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alterpruefung {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		System.out.print("Wie Alt bist du ? : ");
		String input = br.readLine();
		
		int alter = Integer.parseInt(input.trim());
		
		if (alter < 18 && alter >= 14) {
			System.out.println("Mit "+ alter +" bist du noch Minderjährig.");
		}
		else if (alter >= 18) {
			System.out.println("Mit "+ alter +" bist du schon Volljährig.");
		}
		else if (alter <= 13) {
			System.out.println("Mit "+ alter +" bist du noch ein Kind.");
		}
		
		

	}

}
