package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Sparvertrag {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		DecimalFormat f = new DecimalFormat("#0.00");
		
		System.out.print("Bitte Kapital eingeben : ");
		String kapital1 = br.readLine();
		double kapital = Double.parseDouble(kapital1.trim());
		
		System.out.print("Bitte den Zinssatz eingeben : ");
		String zins1 = br.readLine();
		double zins = Double.parseDouble(zins1.trim());
		
		System.out.print("Bitte die Laufzeit in Jahren eingeben : ");
		String laufzeit1 = br.readLine();
		double laufzeit = Double.parseDouble(laufzeit1.trim());
		
		
		
		 System.out.println("Jahr" + "\tAnfangskapital" + "\tZinsbetrag" + "\tJahresendbetrag");
		for(int i = 1; i <= laufzeit; i++) {
			double rechnung = zins * (kapital / 100);
			double rechnung2 = rechnung + kapital;
			
			System.out.println(i + "\t" + f.format(kapital) + "\t\t" +f.format(rechnung)+ "\t\t" + f.format(rechnung2));
			kapital = rechnung2;
		}
		System.out.print("Weiteren Sparvertrag berechnen? -> Dann 'j' eingeben! falls nicht dann 'n'!");
		String ja = br.readLine();

		
		if (ja.equalsIgnoreCase("j")) {
			main(args);
		}
		else if (ja.equalsIgnoreCase("n")) {
			return;
		}
		else {
			System.out.println("Keine Ordnungsgem‰ﬂe Antwort");
			return;
		}
		
 
	}

}
