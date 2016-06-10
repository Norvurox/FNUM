package Array;

import java.io.IOException;

public class Verdoppeln {

	public static void main(String[] args) throws IOException {
		
		double[]zahlen;
		double[]verdoppeln;
		
		System.out.print("Wie viele Slots soll ihr Array haben?: ");
		String in = IO.readString();
		int slots = Integer.parseInt(in.trim());
		
		zahlen = new double[slots];
		verdoppeln = new double[slots];
		
		for(int i = 0;i < zahlen.length;i++) {
			
			System.out.print("Zahl " +i+ ": ");
			String input1 = IO.readString();
		    double input = Double.parseDouble(input1.trim());
		    zahlen[i] = input;
		    
		}
		
		System.out.println("Vorheriges Array: ");
		
		for(int i = 0; i < zahlen.length;i++) {
			System.out.print(zahlen[i] + "\t");
		}
		
		System.out.println("\nNeues Array: ");
		
		for(int i = 0; i < verdoppeln.length;i++) {
			System.out.print((zahlen[i] * 2) + "\t");
		}
		
		
		

	}

}
