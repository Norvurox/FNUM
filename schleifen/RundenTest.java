package schleifen;

public class RundenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = Math.PI;
		for(int i = 0; i <= 4; i++) {
			System.out.println("\n" + Runden.runden(n, i+1));
		}

	}

}
