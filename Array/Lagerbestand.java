package Array;

import java.io.IOException;

public class Lagerbestand {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Wie viel unterschiedliche Artikel haben Sie im Lager?: ");
		String in = IO.readString();
		int input = Integer.parseInt(in.trim());
		
		int count = 0;
		double price2 = 0;
		double[] price = new double[input];
		int[] arr = new int[input];
		String[] text = new String[input];
		double[] dreckszahlen = new double[input];
		int[] arr2 = new int[input];
		
		System.out.print("Erfassen Sie die einzelnen Artikelbezeichnungen: \n");
		for (int i = 0;i < arr.length;i++) {
			i++;
			System.out.print("Artikel " + i + ": ");
			String input2 = IO.readString();
			text[i-1] = input2;
			i--;
		}
		System.out.print("Erfassen Sie jetzt den Einzelpreis jedes Artikels: \n");
		for (int i = 0;i < arr.length;i++) {
			i++;
			System.out.print("Preis des Artikels '"+ text[i-1] + "': ");
			String input10= IO.readString();
			double input2 = Double.parseDouble(input10.trim().replace(',','.'));
			dreckszahlen[i-1] = input2;
			i--;
			price[i] += dreckszahlen[i];
		}
		System.out.print("Erfassen Sie jetzt die Anzahl der einzelnen Artikel: \n");
		for (int i = 0;i < arr.length;i++) {
			i++;
			System.out.print("Menge des Artikels '"+ text[i-1] + "': ");
			String input10= IO.readString();
			int input5 = (int) Double.parseDouble(input10.trim().replace(',','.'));
			arr2[i-1] = input5;
			count += input5;
			i--;
			price[i] *= arr2[i];
		}
		for(int i = 0; i < arr.length;i++) {
			price2 += price[i];
		}
		System.out.println("In ihrem Lager befinden sich insgesamt "+ count + " Artikel im Wert von " + price2 + "€");
	}

}
