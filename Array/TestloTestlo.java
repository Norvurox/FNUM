package Array;

import java.io.IOException;

public class TestloTestlo {

	public static void main(String[] args) throws IOException {
		
		double[] array = null;
		
		array = IO.readDoubleArray();
        System.out.println("Minimal: " +Mathe.ermittleMin(array)
        +"\nMaximal: "
        +Mathe.ermittleMax(array)
        +"\nArithbla: "
        +Mathe.berechneArith(array)
        +"\nVarianz: "
        +Mathe.berechneVarianz(array)
        +"\nStandartabweichung: "
        +Mathe.berechneStandartAbw(array));
	}

}
