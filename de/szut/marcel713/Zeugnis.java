package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zeugnis {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
		int i = 0;
		
		double avg = 0;
		
		System.out.print("Gib deine Anzahl von Fächern an : ");
		String subject = br.readLine();
		
		int s = Integer.parseInt(subject.trim());
		
		while(i < s)  {
			i++;
			System.out.print("Note "+ i +" : ");
			String banane = br.readLine();
			int banane2 = Integer.parseInt(banane.trim());
			avg += banane2;
			
			if (i == s) {
				System.out.println("Durchschnitt : "+ avg / s);
			}
			
			
		}

	}

}