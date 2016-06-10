package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class LK_MarcelBogutzki {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		DecimalFormat f = new DecimalFormat("#0.0");

		System.out.print("Bitte Menge in mg eingeben: ");
		String menge1 = br.readLine();		
		double menge = Double.parseDouble(menge1.trim().replace(',','.'));

		System.out.print("Bitte Zerfallsrate pro Jahr in Prozent eingeben: ");
		String zerfall1 = br.readLine();
		int zerfall = Integer.parseInt(zerfall1.trim());

		System.out.print("Bitte Zeitspanne in Jahren eingeben: ");
		String zeitspanne1 = br.readLine();
		int zeitspanne = Integer.parseInt(zeitspanne1.trim());

		double menge2 = menge;

		System.out.println("\nJahr" + "\tMenge am Jahresanfang" + "\t\tZerfall" + "\t\tMenge am Jahresende");
		System.out.println("----" + "\t---------------------" + "\t\t-------" + "\t\t-------------------");
		for(int i = 1; i <= zeitspanne; i++) {
			double rechnung = (zerfall * (menge / 100));
			double rechnung2 = menge - rechnung;

			if (rechnung2 < (menge2 / 2)) {
				System.out.println(i + "\t" + f.format(menge) + "\t\t\t\t" + f.format(rechnung) + "\t\t" + f.format(rechnung2) + " **");
			}
			else {
				System.out.println(i + "\t" + f.format(menge) + "\t\t\t\t" + f.format(rechnung) + "\t\t" + f.format(rechnung2));
			}

			menge = rechnung2;

		}

		boolean abc = true;

		do {
			System.out.print("\nWeitere Aufgabe bearbeiten? 1 = Ja/ 0 = Nein: ");
			String replay1 = br.readLine();
			int replay = Integer.parseInt(replay1.trim());

			if (replay == 0) {
				return;
			} 
			else if (replay == 1) {
				main(args);
			} 
			else {
				System.out.println("\nInkorrekte Eingabe. Versuchen sie es erneut.");
			}
		} while (abc);

	}

}
