import java.util.Random;
import java.util.Scanner;
public class Three {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of the array: "); 
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] vectorA = new int[n];
        int[][] a = new int[n][n];
        int k = 50;

        Random random = new Random();
        System.out.println("Matrix:");

        for (int j = 0; j < a.length; j++) {
            int min = Integer.MAX_VALUE;
            int minIn = 0;
            for (int i = 0; i < a.length; i++) { 
                int u = -10 + random.nextInt(k);
                a[i][j] = u;
                if (u < min) { 
                    min = u;
                    minIn = i;
                }
            }
            vectorA[j] = minIn;
        }

        for (int i = 0; i < a.length; i++) {  
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("Index of the minimum element of the string " + i + " = " + vectorA[i]);
}}}
  