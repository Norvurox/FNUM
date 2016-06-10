package schleifen;

public class tausendmal {

	public static void main(String[] args)  {
		
		
		int h = 0;
		
		for (int i = 1;i <= 6000;i++) {
			int Zufallszahl = (int) (Math.random() * 6 + 1);
			System.out.println(Zufallszahl);
			
			
			
			if (Zufallszahl == 6) {
				h++;
			}
		}
		System.out.println("\n" + h);
		
	}

}
