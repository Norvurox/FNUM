package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FestesArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int[]zahlen = new int[5];
		
		for (int i = 0; i < zahlen.length;i++) {
			System.out.print("Zahl " + i + ": ");
			String input = br.readLine();
			int input1 = Integer.parseInt(input.trim());
			zahlen[i] = input1;
			}
		
		for (int i = 0;i < zahlen.length;i++) {
			System.out.println(zahlen[i]);
		    }

	}

}
