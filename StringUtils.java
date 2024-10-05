package gr.aueb.cf.ch14;

/**
 * Υλοποιήστε μία utility class με όνομα StringUtils
 * με public static μεθόδους για string manipulation, όπως να γίνεται reverse ένα
 * string, να μετατρέπεται ένα string σε uppercase και νa ελέγχεται εάν ένα string είναι παλινδρομικό
 */
public class StringUtils {

    private StringUtils () {

    }

    public static String reverseString (String input) {

        char [] newInput = input.toCharArray();
        int begin = 0;
        int end = newInput.length - 1;
        char temp;

        while ( end > begin){
            temp = newInput[begin];
            newInput[begin] = newInput[end];
            newInput[end] = temp;
            end--;
            begin++;
        }
        return new String(newInput);
    }

    public static String upperCaseString (String input) {
        return input.toUpperCase();
    }

    public static boolean isPalindrome (String str) {

        int n = str.length();

        for (int i = 0; i < n/2; i++){
            if (str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
