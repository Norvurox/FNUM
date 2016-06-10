package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Bist du M‰nnlich oder Weiblich m/w ? : ");
		String gender = br.readLine();

		System.out.print("Wie viel Wiegst du ? : ");
		String weight = br.readLine();
		Double weightInt = Double.parseDouble(weight.trim());

		System.out.print("Wie Groﬂ bist du ? : ");
		String height = br.readLine();
		Double heightInt = Double.parseDouble(height.trim());

		heightInt = heightInt / 100;
		double bmi = weightInt / (heightInt * heightInt);
		int bmirounded = (int) Math.round(bmi);
		System.out.println("Deine BMI ist : "+ bmirounded);

		if (gender.equals("m") && bmirounded < 20) {
			System.out.println("Du hast Untergewichtig !");
		}
		else if (gender.equals("w") && bmirounded < 19) {
			System.out.println("Du hast Untergewichtig !");
		}
		else if (gender.equals("m") && bmirounded >= 20 && bmirounded <= 25) {
			System.out.println("Du hast Normalgewichtig !");
		}
		else if (gender.equals("w") && bmirounded >= 19 && bmirounded <= 24) {
			System.out.println("Du hast Normalgewichtig !");
		}
		else if (gender.equals("m") && bmirounded >= 26 && bmirounded <= 30) {
			System.out.println("Du hast ‹bergewichtig !");
		}
		else if (gender.equals("w") && bmirounded >= 25 && bmirounded <= 30) {
			System.out.println("Du hast ‹bergewichtig !");
		}
		else if (gender.equals("m") || gender.equals("w") && bmirounded >= 31 && bmirounded < 40) {
			System.out.println("Du hast Adipositas !");
		}
		else if (gender.equals("m") || gender.equals("w") && bmirounded > 40) {
			System.out.println("Du hast starke Adipositas !");
		}


	}
}
