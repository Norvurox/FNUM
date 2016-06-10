package Array;

import java.io.IOException;

public class SuchenInArray {

	public static void main(String[] args) throws IOException {
		
		double[] zahlen = IO.readDoubleArray();
		
		System.out.print("Welche Zahl möchten sie suchen?: ");
		String suchen1 = IO.readString();
		double suchen = Double.parseDouble(suchen1.trim());
		
		for(int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] == suchen) {
				System.out.println("Treffer");
			}
			else {
				System.out.println("Niete");
			}
		}
		

	}

}
