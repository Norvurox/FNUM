package Array;

import java.io.IOException;

public class Summen {

	public static void main(String[] args) throws IOException {
		
		int[]zahlen;
		
		System.out.print("Wie viele Slots soll ihr Array haben?: ");
		int serhatboss = IO.readInteger();
		
		zahlen = new int[serhatboss];
		
		for(int i = 0; i < zahlen.length; i++) {
			System.out.print("Zahl "+i+": ");
			int in = IO.readInteger();
			zahlen[i] = in;
		}
		
		int countG = 0;
		int countU = 0;
		int gerade = 0;
		int ungerade = 0;
		
		for(int i = 0; i < zahlen.length; i++) {
			
			
			if(zahlen[i] % 2 == 0) {
				countG++;
				gerade = gerade + zahlen[i];
			}
			else {
				countU++;
				ungerade = ungerade + zahlen[i];
			}
			
		}
		System.out.println("Gerade Zahlen: ");
		System.out.println("Anzahl: "+ countG);
		System.out.println("Summe: "+ gerade);
		System.out.println("Ungerade Zahlen: ");
		System.out.println("Anzahl: "+ countU);
		System.out.println("Summe: "+ ungerade);

	}

}
