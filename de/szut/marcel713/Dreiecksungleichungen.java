			package de.szut.marcel713;
			
			import java.io.BufferedReader;
			import java.io.IOException;
			import java.io.InputStreamReader;
			
			public class Dreiecksungleichungen {
			
				public static void main(String[] args) throws IOException {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					
					
					
					System.out.print("Geben sie die Seitenlänge A an : ");
					String A = br.readLine();
					
					System.out.print("Geben sie die Seitenlänge B an : ");
					String B = br.readLine();
					
					System.out.print("Geben sie die Seitenlänge C an : ");
					String C = br.readLine();
					
					double a = Double.parseDouble(A.trim());
					
					double b = Double.parseDouble(B.trim());
					
					double c = Double.parseDouble(C.trim());
					
					double s = (a + b + c) / 2 ;
					
					if (c < (a + b) && b < (a + b) && a < (c + b)) {
						System.out.println("Mit diesen Seintenlängen ist ein Rechtwinkliges Dreieck zeichnungsbar!");
						System.out.println("Umfang : " + (a + b + c));
						System.out.println("Flächeninhalt : " + Math.sqrt(s*(s-a)*(s-b)*(s-c)));
						
					}

					else {
						System.out.println("Mit diesen Seintenlängen ist ein Rechtwinkliges Dreieck NICHT zeichnungsbar!");
					}
			
				}
			
			}
