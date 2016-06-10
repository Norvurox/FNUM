package Array;

import java.io.IOException;

public class Tonsignal {

	public static void main(String[] args) throws IOException {
		
		int[]zahlen;
		int[]zahlen2;
		
		System.out.print("Wie viele Slots soll ihr Array haben?: ");
		int serhatboss = IO.readInteger();
		
		zahlen = new int[serhatboss];
		zahlen2 = new int[zahlen.length];
		
		for(int i = 0; i < zahlen.length; i++) {
			System.out.print("Zahl "+i+": ");
			int in = IO.readInteger();
			zahlen[i] = in;
		}
		
		zahlen2[0] = zahlen[0] + zahlen[1] / 2;
		zahlen2[zahlen.length-1] = (zahlen[zahlen.length-1] + zahlen[zahlen.length-2]) / 2;
		
		for(int i = 1;i < zahlen.length-1; i++) {
			zahlen2[i] = (zahlen[i-1] + zahlen[i] + zahlen[i+1]) / 3;
		}
		
		System.out.println("Ursprungssignal: ");
		for (int i = 0;i < zahlen.length;i++) {
			System.out.print(zahlen[i] + " ");
		}
		
		System.out.println("\nGeglättetes Signal: ");
		for (int i = 0; i < zahlen2.length; i++) {
			System.out.print(zahlen2[i] + " ");
		}
		
	}
	
}
