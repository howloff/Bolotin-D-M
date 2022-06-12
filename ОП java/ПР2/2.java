//Дан массив А(н). Переписать в массив б(н) только положительные элементы массива а, деленные на 3.
//Затем порядочить методом по возврастанию новый массив.
//Вариант 6
import java.util.*;
public class Two {
    public static void main(String[] args) {

        int n = 0;
        int count = 0;
        int x[] = {-4, 10, 13, -9, 25, 3, 33, -30, 99, -200, 333, -333, 73, 6, 66};

        System.out.println("\nInitial array:");

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "; ");
            if (x[i] > 0) {
                n++;
            }
        }

        float  y[] = new float [n];

        for (int j = 0; j < x.length; j++) {
            if (x[j] > 0) {
                y[count] = (float ) x[j] / 3;
                count++;
            }
        }

        System.out.println("\n\nModified array\r\n"
        		+ ":");
        Arrays.sort(y);
        for(int i = 0; i <  y.length; i++) {
            System.out.print(y[i] + ";  ");
        }
    }
}
