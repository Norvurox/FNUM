package oop;

import java.io.IOException;

public class TestIO {

	public static void main(String[] args) throws IOException {

		boolean inputS = false;

		do {

			System.out.print("Bitte String , int , double , boolean oder mindestwert (min) eingeben eingeben: ");
			String input = IO.readString();

			if (input.equalsIgnoreCase("String")) {

				System.out.print("Bitte String eingeben: ");
				String input2 = IO.readString();
				System.out.println(input2);

			} else if (input.equalsIgnoreCase("int")) {

				System.out.print("Bitte int Zahl eingeben: ");
				int input3 = IO.readInteger();
				System.out.println(input3);

			} else if (input.equalsIgnoreCase("boolean")) {

				System.out.print("Bitte boolean eingeben: ");
				boolean input4 = IO.readBoolean();
				System.out.println(input4);

			} else if (input.equalsIgnoreCase("double")) {

				System.out.print("Bitte double Zahl eingeben: ");
				double input5 = IO.readDouble();
				System.out.println(input5);
			}
			else if (input.equalsIgnoreCase("min")) {
				
				System.out.print("Zahl höher 1000 eingeben: ");
				double banane = IO.readDouble(1000);
				System.out.println(banane);
			
			}
			System.out.print("Weitere Eingabe ?: ");
			inputS = IO.readBoolean();
		
		} while (inputS == true);



	}

}
