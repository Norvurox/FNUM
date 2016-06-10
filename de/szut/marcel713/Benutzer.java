package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Benutzer {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Name: ");
		String name = br.readLine();
		System.out.print("Nachname: ");
		String nachname = br.readLine();
		
		System.out.println("Name: " + name + " Nachname: " + nachname); 
		System.out.println("Hallo !");

	}

}
