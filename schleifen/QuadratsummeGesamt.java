package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadratsummeGesamt {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Quadratsumme von : ");
		String zahl = br.readLine();
		double number = Double.parseDouble(zahl.trim());
		
		double banane = 0;
		
		for(int i = 0; i <= number; i++) {
			banane = banane + Math.pow(i, 2);
		}
		System.out.println("Quadratsumme : " + banane);
		
       
	}

}
