package Array;

import java.io.IOException;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws IOException {
		double[] zahlen = IO.readDoubleArray();
		Arrays.sort(zahlen);
		System.out.println("Kleinste Zahl des Arrays: " + Mathe.ermittleMin(zahlen) 
				+ "\nGrößte Zahl des Arrays: " + Mathe.ermittleMax(zahlen) 
				+ "\nMittelwert: " + Mathe.berechneArith(zahlen)
				+ "\nVarianz: "+ Mathe.berechneVarianz(zahlen)
				+ "\nStandartabweichung: "+ Mathe.berechneStandartAbw(zahlen));

	}

}
