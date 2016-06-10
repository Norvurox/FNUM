package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FakultaetGesamt {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("While (W) oder For (F) schleife? : ");
		String wf = br.readLine();
		System.out.print("Fakultät von : ");
		String zahl = br.readLine();
		int number = Integer.parseInt(zahl.trim());

		int banane = 1;

		if (wf.equalsIgnoreCase("F")) {
			for(int i = 1; i <= number; i++) {
				banane = banane * i;	
			}			
		}

		int i = 0;
		if (wf.equalsIgnoreCase("W")) {
		while(i < number) {
				i++;
				banane = banane * i;
			}
		}
		System.out.println(banane);

	}

}
