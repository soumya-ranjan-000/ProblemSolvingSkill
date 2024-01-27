package array;

import java.util.function.Consumer;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] number=new int[6];
        number[0]=10;
        number[1]=12;
        number[2]=1;
        number[3]=7;
        number[4]=6;
        number[5]=9;

        printArray(number);
        number=reverseArray(number);
        System.out.println("==================");
        printArray(number);


    }
// 1. complexity 2n+13 = O(n)
//    static int[] reverseArray(int[] arr){
//        int oldArrLen=arr.length;
//        int lastIndex=oldArrLen-1;
//        int[] newarr=new int[oldArrLen];
//        for(int i=0;i< oldArrLen;i++){
//            newarr[i]=arr[lastIndex-i];
//        }
//        return newarr;
//    }

    // 2. Complexity= n+13 = O(n)
    static int[] reverseArray(int[] arr){
        int temp;
        for(int i=0;i< arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }


    static void printArray(int[] num){
        for (int n : num) {
            System.out.println(n);
        }
    }
}
