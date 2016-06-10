package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zahlenraten {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int zahl = 5;
        System.out.println("Denk dir eine Zahl zwischen 1 und 10.");
        
        while (true) {
        	System.out.print("Ist die Zahl < , > oder = " + zahl +": ");
        	String input = br.readLine();
        	
        	if (input.equals("=")) {
        		System.out.println("Deine Zahl ist " + zahl +".");
        		return;
        	}
        	
        	else if (zahl == 5) {
        		if (input.equals("<")) {
        			zahl = 3;
        		}
        		if (input.equals(">")) {
        			zahl = 7;
        		}
        		
        	}
        	else if (zahl == 3) {
        		if (input.equals("<")) {
        			zahl = 1;
        		}
        		if (input.equals(">")) {
        			System.out.println("Deine Zahl ist 4.");
        			return;
        		}
        	}
        	else if (zahl == 1) {
        		if (input.equals("<")) {
        			System.out.println("Du Lügner !");
        			return;
        		}
        		if (input.equals(">")) {
        			System.out.println("Deine Zahl ist 2.");
        			return;
        		}
        	}
        	else if (zahl == 7) {
        		if (input.equals("<")) {
        			System.out.println("Deine Zahl ist 6.");
        			return;
        		}
        		if (input.equals(">")) {
        			zahl = 9;
        		}
        	}
        	else if (zahl == 9) {
        		if (input.equals("<")) {
        			System.out.println("Deine Zahl ist 8.");
        			return;
        		}
        		if (input.equals(">")) {
        			System.out.println("Deine Zahl ist 9.");
        		}
        	}
        }



	}
}

