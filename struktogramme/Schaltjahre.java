package struktogramme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Schaltjahre {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Mit welchem Jahr soll gestartet werden?: ");
		String anfang1 = br.readLine();
		int anfang = Integer.parseInt(anfang1.trim());

		System.out.print("Bis zu welchem Jahr?: ");
		String ende1 = br.readLine();
		int ende = Integer.parseInt(ende1.trim());

		for (int i = anfang; i <= ende; i++) {
			int rest = i % 4;
			int rest2;

			if (rest == 0) {
				rest = i % 100;
				rest2 = i % 400;
				if (rest > 0 || (rest == 0 && rest2 == 0)) {
					System.out.println(i);
				}
			}          

		}





	}

}
