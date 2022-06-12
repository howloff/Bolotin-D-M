
public class One {
    public static final int N = 4; //N -  константа
    public static void main(String[] args) {
        int[] array = { 9, 66, 33, 12, 55, 1, 3, 44 }; // Исходный массив
        int[] maxelements = new int [ N ];
        
        int minindex = 0;
        for ( int i = 1; i < array.length; ++i )
            if ( array[i] < array[minindex] )
                minindex = i;
        
        for ( int i = 0; i < N; ++i )
            maxelements[i] = array[minindex];
        
        for ( int i = 0; i < array.length; ++i ) {
            for ( int j = 0; j < N; ++j ) {
                if ( maxelements[j] < array[i] ) {
                    for ( int k = N - 1; k > j; --k ) {
                        maxelements[k] = maxelements[k - 1];
                    }
                    maxelements[j] = array[i];
                    break;
                }
            }
        }
        
        System.out.print("Array: ");
        for ( int n : array )
            System.out.print(n + " ");
        System.out.print("\n" + N + " max. elements: ");
        for ( int n : maxelements )
            System.out.print(n + " ");
        
        System.out.println();
    }
}
