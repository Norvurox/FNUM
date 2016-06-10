package Array;

import java.util.Arrays;

public class Mathe {

	
    public static double ermittleMin(double[] array) {
    	Arrays.sort(array);
        double min = array[0];
        return min;
    }
    
    public static double ermittleMax(double[] array) {
        double max = array[array.length-1];
        Arrays.sort(array);
        return max;
    }
    
    public static double berechneArith(double[] array) {
        double arith = 0;
        Arrays.sort(array);
    	for(int i = 0;i < array.length;i++) {
            arith += array[i];
        }
        arith /= array.length;
        return arith;
    }
    
    public static double berechneVarianz(double[] array) {
        double varianz = 0, arith = 0;
        Arrays.sort(array);
        arith = berechneArith(array);
    	for(int i = 0;i < array.length;i++) {
            varianz += Math.pow(array[i] - arith, 2);
        }
        varianz /= array.length;
        return varianz;
    }
    
    public static double berechneStandartAbw(double[] array) {
        double stdAbw = 0, varianz = 0;
        Arrays.sort(array);
    	varianz = berechneVarianz(array);
        stdAbw = Math.sqrt(varianz);
        return stdAbw;
    }

}
