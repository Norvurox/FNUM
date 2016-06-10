package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FakultaetFor {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Fakultät von : ");
		String zahl = br.readLine();
		int number = Integer.parseInt(zahl.trim());
		
		int banane = 1;
		
		for(int i = 1; i <= number; i++) {
			banane = banane * i;
		}
		System.out.println(banane);

	}

}
