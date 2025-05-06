package math;

import java.util.Scanner;

public class FindNumOfTrailingZeroOfFactorial {
    public static int findTrailingZeros(int n) {
        if (n < 0) return -1;
        int numberOfZero = 0;
        int j = 5;
        while (n / j>0) {
            numberOfZero = numberOfZero + n / j;
            j = j*5;
        }
        return numberOfZero;
    }
//    static int findTrailingZeros(int n)
//    {
//        if (n < 0) // Negative Number Edge Case
//            return -1;
//
//        // Initialize result
//        int count = 0;
//
//        // Keep dividing n by powers
//        // of 5 and update count
//        for (int i = 5; n / i >= 1; i *= 5)
//            count += n / i;
//
//        return count;
//    }

    public static void main(String[] args) {
        System.out.println(findTrailingZeros(new Scanner(System.in).nextInt()));
    }
}

