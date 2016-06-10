package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class iamk {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		
		System.out.print("Wie lange wollen sie es durchlaufen lassen geben sie eine zahl an aminakoyim: ");
		String orusbu = br.readLine();
		int gelmisini = Integer.parseInt(orusbu.trim());
		
		int i = 0;
		
        while (i < gelmisini) {
        	
        	i++;
        	
        	System.out.println(i);
        	
        }
		

	}

}
