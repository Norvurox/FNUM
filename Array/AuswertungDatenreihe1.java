package Array;

import java.io.IOException;
import java.util.Arrays;

public class AuswertungDatenreihe1 { // 5 8 6 3 12 3 = 37 arith = 6,167 varianz = 9,8056
     static double min = 0;
     static double max = 0;
     static double varianz = 0;
     static double arith = 0;
     static double stdAbw = 0;
     static double[] array = null;
     
     public static void main(String args[]) throws IOException {
         array = IO.readDoubleArray();
         Arrays.sort(array);
         System.out.println("Minimal: " +ermittelMin()
         +"\nMaximal: "
         +ermittleMax()
         +"\nArithbla: "
         +berechneArith()
         +"\nVarianz: "
         +berechneVarianz()
         +"\nStandartabweichung: "
         +berechneStandartAbw());
         
     }
     
     public static double ermittelMin() {
         min = array[0];
         return min;
     }
     
     public static double ermittleMax() {
         max = array[array.length-1];
         return max;
     }
     
     public static double berechneArith() {
         for(int i = 0;i < array.length;i++) {
             arith += array[i];
         }
         arith /= array.length;
         return arith;
     }
     
     public static double berechneVarianz() {
         for(int i = 0;i < array.length;i++) {
             varianz += Math.pow(array[i] - arith, 2);
         }
         varianz /= array.length;
         return varianz;
     }
     
     public static double berechneStandartAbw() {
         stdAbw = Math.sqrt(varianz);
         return stdAbw;
     }

}

