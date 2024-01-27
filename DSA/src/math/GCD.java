package math;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
//        System.out.println(findGCDOne(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt()));
        System.out.println(findGCDtwo(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt()));

    }
    //method 1
    static int findGCDOne(int a, int b){
        if(a==0) return b;
        if(b==0) return a;
        if(a==b) return a;
        if(a>b) return findGCDOne(a-b,b);
        else return findGCDOne(b-a,a);
    }
    //method 2
    static int findGCDtwo(int a,int b) {
        if(b==0) return a;
        return findGCDtwo(b,a%b);
    }
}
