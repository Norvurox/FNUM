package de.szut.marcel713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Werder {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Wie viele Tickets wurden gekauft ? : ");
		String ticket = br.readLine();
		double ticket1 = Double.parseDouble(ticket.trim());

		System.out.print("F�r welchen Rang oder f�r welche Kurve wurden die Tickets gekauft (Ost-/Westkurve oder Nord-/S�drang) ? : ");
		String rang = br.readLine();

		System.out.print("F�r welche Liga wurde das Ticket gekauft (Bundesliga,Europa-League oder Champion-League) ? : ");
		String liga = br.readLine();



		
		if (ticket1 >= 1 && ticket1 <= 10 && (rang.equalsIgnoreCase("Ostkurve") || rang.equalsIgnoreCase("Westkurve")) && liga.equalsIgnoreCase("Bundesliga")) {
			System.out.println("Bruttopreis : "+ ticket1 * 15 + "�");
			System.out.println("Nettopreis : "+ ((ticket1 * 15) - ((ticket1 * 15) / 100) * 19) + "�");
		}
		else if (ticket1 >= 1 && ticket1 <= 10 && (rang.equalsIgnoreCase("Nordrang") || rang.equalsIgnoreCase("S�drang")) && liga.equalsIgnoreCase("Bundesliga")) {
			System.out.println("Bruttopreis : "+ ticket1 * 20 + "�");
			System.out.println("Nettopreis : "+ ((ticket1 * 20) - ((ticket1 * 20) / 100) * 19) + "�");
		}
		else if (ticket1 >= 1 && ticket1 <= 10 && (rang.equalsIgnoreCase("Ostkurve") || rang.equalsIgnoreCase("Westkurve")) && liga.equalsIgnoreCase("Europa-League")) {
			System.out.println("Bruttopreis : "+ ticket1 * 20 + "�");
			System.out.println("Nettopreis : "+ ((ticket1 * 20) - ((ticket1 * 20) / 100) * 19) + "�");
		}
		else if (ticket1 >= 1 && ticket1 <= 10 && (rang.equalsIgnoreCase("Nordrang") || rang.equalsIgnoreCase("S�drang")) && liga.equalsIgnoreCase("Europa-League")) {
			System.out.println("Bruttopreis : "+ ticket1 * 30 + "�");
			System.out.println("Nettopreis : "+ ((ticket1 * 30) - ((ticket1 * 30) / 100) * 19) + "�");
		}
		else if (ticket1 >= 1 && ticket1 <= 10 && (rang.equalsIgnoreCase("Ostkurve") || rang.equalsIgnoreCase("Westkurve")) && liga.equalsIgnoreCase("Champion-League")) {
			System.out.println("Bruttopreis : "+ ticket1 * 25 + "�");
			System.out.println("Nettopreis : "+ ((ticket1 * 25) - ((ticket1 * 25) / 100) * 19) + "�");
		}
		else if (ticket1 >= 1 && ticket1 <= 10 && (rang.equalsIgnoreCase("Nordrang") || rang.equalsIgnoreCase("S�drang")) && liga.equalsIgnoreCase("Champion-League")) {
			System.out.println("Bruttopreis : "+ ticket1 * 40 + "�");
			System.out.println("Nettopreis : "+ ((ticket1 * 40) - ((ticket1 * 40) / 100) * 19) + "�");
		}




		else if (ticket1 > 10 && (rang.equalsIgnoreCase("Ostkurve") || rang.equalsIgnoreCase("Westkurve")) && liga.equalsIgnoreCase("Bundesliga")) {
			System.out.println("Bruttopreis : "+ ((ticket1 * 15) - ((ticket1 * 15) / 100) * 10) + "�");
			System.out.println("Nettopreis : "+ ((((ticket1 * 15) - ((ticket1 * 15) / 100) * 10)) - (((ticket1 * 15) - ((ticket1 * 15) / 100) * 10) / 100) * 19) + "�");
		}
		else if (ticket1 > 10 && (rang.equalsIgnoreCase("Nordrang") || rang.equalsIgnoreCase("S�drang")) && liga.equalsIgnoreCase("Bundesliga")) {
			System.out.println("Bruttopreis : "+ ((ticket1 * 20) - ((ticket1 * 20) / 100) * 10) + "�");
			System.out.println("Nettopreis : "+ ((((ticket1 * 20) - ((ticket1 * 20) / 100) * 10)) - (((ticket1 * 20) - ((ticket1 * 20) / 100) * 10) / 100) * 19) + "�");
		}
		else if (ticket1 > 10 && (rang.equalsIgnoreCase("Ostkurve") || rang.equalsIgnoreCase("Westkurve")) && liga.equalsIgnoreCase("Europa-League")) {
			System.out.println("Bruttopreis : "+ ((ticket1 * 20) - ((ticket1 * 20) / 100) * 10) + "�");
			System.out.println("Nettopreis : "+ ((((ticket1 * 20) - ((ticket1 * 20) / 100) * 10)) - (((ticket1 * 20) - ((ticket1 * 20) / 100) * 10) / 100) * 19) + "�");
		}
		else if (ticket1 > 10 && (rang.equalsIgnoreCase("Nordrang") || rang.equalsIgnoreCase("S�drang")) && liga.equalsIgnoreCase("Europa-League")) {
			System.out.println("Bruttopreis : "+ ((ticket1 * 30) - ((ticket1 * 30) / 100) * 10) + "�");
			System.out.println("Nettopreis : "+ ((((ticket1 * 30) - ((ticket1 * 30) / 100) * 10)) - (((ticket1 * 30) - ((ticket1 * 30) / 100) * 10) / 100) * 19) + "�");
		}
		else if (ticket1 > 10 && (rang.equalsIgnoreCase("Ostkurve") || rang.equalsIgnoreCase("Westkurve")) && liga.equalsIgnoreCase("Champion-League")) {
			System.out.println("Bruttopreis : "+ ((ticket1 * 25) - ((ticket1 * 25) / 100) * 10) + "�");
			System.out.println("Nettopreis : "+ ((((ticket1 * 25) - ((ticket1 * 25) / 100) * 10)) - (((ticket1 * 25) - ((ticket1 * 25) / 100) * 10) / 100) * 19) + "�");
		}
		else if (ticket1 > 10 && (rang.equalsIgnoreCase("Nordrang") || rang.equalsIgnoreCase("S�drang")) && liga.equalsIgnoreCase("Champion-League")) {
			System.out.println("Bruttopreis : "+ ((ticket1 * 40) - ((ticket1 * 40) / 100) * 10) + "�");
			System.out.println("Nettopreis : "+ ((((ticket1 * 40) - ((ticket1 * 40) / 100) * 10)) - (((ticket1 * 40) - ((ticket1 * 40) / 100) * 10) / 100) * 19) + "�");
		}
		else if (ticket1 < 1) {
			System.out.println("Ung�ltige Angabe man kann keine negativen Tickets kaufen !");
			
		}

	}

}
