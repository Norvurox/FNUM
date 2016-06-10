package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VariablesArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Wie viele Slots soll ihr Array haben?: ");
		String input1 = br.readLine();
		int input = Integer.parseInt(input1.trim());
		
		int[]zahlen = new int[input];
		
		for (int i = 0; i < zahlen.length;i++) {
			System.out.print("Zahl " + i + ": ");
			String input10 = br.readLine();
			int input2 = Integer.parseInt(input10.trim());
			zahlen[i] = input2;
			}
		
		for (int i = 0;i < zahlen.length;i++) {
			System.out.println(zahlen[i]);
		    }
		

	}

}
