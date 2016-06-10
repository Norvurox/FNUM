package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bevölkerungswachstum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Bitte Anzahl der Menschen in Milliarden erfassen: ");
        String menschen1 = br.readLine();
        double menschen = Double.parseDouble(menschen1.trim());
        
		System.out.print("Bitte prozentualen Zuwachs pro Jahr eingeben: ");
        String zuwachs1 = br.readLine();
        double zuwachs = Double.parseDouble(zuwachs1.trim());
        
		System.out.print("Bitte Zeitspanne in Jahren eingeben: ");
        String zeitspanne1 = br.readLine();
        int zeitspanne = Integer.parseInt(zeitspanne1.trim());
        
		System.out.print("Auf wieviel Stellen genau soll das Ergebnis angezeigt werden: ");
        String stellen1 = br.readLine();
        double stellen = Double.parseDouble(stellen1.trim());
        
        System.out.println("\nJahr" + "\tAnzahl am Jahresanfang" + "\t\tZuwachs" + "\t\tAnzahl am Jahresende");
        for(int i = 1; i <= zeitspanne; i++) {
        	double rechnung = menschen * (zuwachs / 100); 
        	double rechnung2 = menschen + rechnung;
        	
        	System.out.println(i + "\t" + Runden.runden(menschen) + "\t\t\t\t" + Runden.runden(rechnung) + "\t\t" + Runden.runden(rechnung2));
        	menschen = rechnung2;
        
        }
        
	}

}
