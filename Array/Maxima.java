package Array;

import java.io.IOException;
import java.util.Arrays;

public class Maxima {

	public static void main(String[] args) throws IOException {
		
		double[] zahlen = IO.readDoubleArray();
		
		double max;
		double max2;
		
		Arrays.sort(zahlen);
		max = zahlen[zahlen.length-1];
		max2 = zahlen[zahlen.length-2];
		
		System.out.println("Gr��te Zahl: " + max);
		System.out.println("Zweitgr��te Zahl: " + max2);
			

		

	}

}
