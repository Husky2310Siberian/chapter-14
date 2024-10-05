package gr.aueb.cf.ch14;

public class StringUtilsMain {

    public static void main(String[] args) {

        String input = "Hello Coding Factory";

        String s = "hello world";

        String s2 = "racecar";


        System.out.println("the initial string is : " +input);
        System.out.println("the reversed string is : " +StringUtils.reverseString(input));

        System.out.println("");

        System.out.println("the initial string is : " +s);

        System.out.println("the upper case string is : " +StringUtils.upperCaseString(s));

        System.out.println("");

        System.out.println(StringUtils.isPalindrome(s));
        System.out.println(StringUtils.isPalindrome(s2));


    }
}
