package gr.aueb.cf.ch14;

/**
 * Υλοποιήστε μία utility class με όνομα
 * MathHelper με public static μεθόδους για κοινές μαθηματικές λειτουργίες όπως εύρεση
 * του μέγιστου, ελάχιστου, και μέσου όρου ενός  array από integers
 */

public class MathHelper {

    /**
     * private constructor  (non - instantiable)
     */
    private MathHelper() {
    }

    public static int findMin (int [] arr) {

        int min = Integer.MAX_VALUE;

        for ( int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax (int [] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findAverage (int [] arr) {

        int sum = 0;
        double average = 1;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        average = (double) sum / arr.length;

        return (int) average;
    }
}
