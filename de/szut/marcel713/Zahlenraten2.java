package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zahlenraten2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Zufallszahl = (int) (Math.random() * 100 + 1);
		
		while (true) {
			System.out.print("Finde die Zahl zwischen 1 und 100 : ");
			String input = br.readLine();
			
			int zahl = Integer.parseInt(input.trim());
			
			if (zahl == Zufallszahl) {
				System.out.println("Die Zahl "+ Zufallszahl +" ist richtig Herzlichen Glückwunsch");
				return;
			}
			else if (zahl < Zufallszahl) {
				if (zahl < Zufallszahl) {
					System.out.println("Meine Zahl ist Größer ! ");
				}
			}
			else if (zahl > Zufallszahl) {
				System.out.println("Meine Zahl ist kleiner ! ");
			}
		}
		

	}

}
