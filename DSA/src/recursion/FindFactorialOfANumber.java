package recursion;

import java.util.Scanner;

public class FindFactorialOfANumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a +ve number: ");
        int input=s.nextInt();
        System.out.printf("Factorial of %d is %d",input,factorial(input));
    }
    static int factorial(int n){
        if(n<0) throw new IllegalArgumentException("can't find factorial of a -ve number.");
        if(n==0) return  1;
        return n*factorial(n-1);
    }
}
