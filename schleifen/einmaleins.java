package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class einmaleins {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Von welcher Zahl möchten Sie das 1 * 1 ausrechnen lassen ? : ");
		String zahl1 = br.readLine();
		int zahl = Integer.parseInt(zahl1.trim());
        
		for (int i = 1;i <= 10;i++) {
			System.out.println(zahl * i);
		}
		
	}

}
