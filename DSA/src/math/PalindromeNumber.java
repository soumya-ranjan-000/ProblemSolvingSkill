package math;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Is " + num + " a palindrome number? " + isAPalindromeNumber(num));
    }

    static boolean isAPalindromeNumber(int number) {
        return number == reverse(number);
    }

    static int reverse(int number) {
        int res = 0;
        while (number > 0) {
            int d = number % 10;
            res = res * 10 + d;
            number = number / 10;
        }
        //alternate
//        StringBuilder num=new StringBuilder(String.valueOf(number));
//        res = Integer.parseInt(String.valueOf(num.reverse()));
        return res;
    }

}
