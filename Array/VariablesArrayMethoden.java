package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VariablesArrayMethoden {
	private static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	private static double[]einlesenZahlen;
	
	public static void main(String[] args) throws IOException {
		VariablesArrayMethoden.readDoubleArray();
		VariablesArrayMethoden.readDoubleArray(0);
	}
	
	private static double[]readDoubleArray(double betrag) throws IOException {
		einlesenZahlen = new double [(int) betrag];

		for (int i = 0; i < einlesenZahlen.length;i++) {
			System.out.print("Zahl " + i + ": ");
			String input10 = br.readLine();
			int input2 = Integer.parseInt(input10.trim());
			einlesenZahlen[i] = input2;
		}
		for(int i = 0; i < einlesenZahlen.length;i++) {
			System.out.println(einlesenZahlen[i]);
		}
		return einlesenZahlen;
	}
	private static double[]readDoubleArray() throws IOException {
		System.out.print("Wie viele Slots soll ihr Array haben?: ");
		double zahl = IO.readInteger();
		
		return readDoubleArray(zahl);
	}

}
