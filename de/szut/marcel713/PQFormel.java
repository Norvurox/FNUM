package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PQFormel {
	
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Geben sie p ein : ");
		String zahl1 = br.readLine();
		
		System.out.print("Geben sie q ein : ");
		String zahl2 = br.readLine();
		
		double p = Double.parseDouble(zahl1.trim());
		
		double q = Double.parseDouble(zahl2.trim());
		
		double formel = (-p/2) + (Math.sqrt(p/2 - q));
		
		double formel1 = (-p/2) - (Math.sqrt(p/2 - q));
		
		System.out.println("x1 : "+ formel);
		
		System.out.println("x2 : "+ formel1);
		
		
		

	}

}
