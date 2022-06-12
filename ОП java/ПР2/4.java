//Дан двумерный массив А размером nxn. Найти ср. арифметическое положительных эл-тов ее побочной диагонали
import java.util.Random;
public class Four {
    public static void main (String[] args) {

        int[][] N = new int[5][5];
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[0].length; j++) {

                N[i][j] = -99 + new Random().nextInt(200);
                System.out.print(N[i][j] + "   ");
            }
            System.out.print("\n");
        }

        System.out.println(" ");
        int count = N.length - 1;
        double nums = 0;
        double m=0;

        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[0].length; j++) {
                if (j == count) {
                    count -= 1;
                    if (N[i][j] > 0) {
                    	nums++;
                        m+=N[i][j];
                        
                    }
                }
            }
        }
        double result = m / nums;
        System.out.println("\nResult: "+result);
    }
}
