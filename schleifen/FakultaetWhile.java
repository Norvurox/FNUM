package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FakultaetWhile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Fakult�t von : ");
		String zahl = br.readLine();
		int number = Integer.parseInt(zahl.trim());
		
		int i = 0;
		
		int banane = 1;
		
		while(i < number) {
			i++;
			banane = banane * i;
		}
		System.out.println(banane);

	}

}
