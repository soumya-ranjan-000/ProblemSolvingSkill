package array;

import java.util.Arrays;
import java.util.Scanner;


// 5. Write a Java program to test if an array contains a specific value
public class Problem5 {
    public static void main(String[] args) {
        searchAnElementInAnArrayWithOutSorting();
    }

    static void searchAnElementInAnArrayWithOutSorting(){
        int[] arr = {4,3,7,1,2,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is present or not in array: ");
        int num = scanner.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                System.out.println("Number found in array");
                return;
            }
        }
        System.out.println("Number not found in array");
    }

    static void searchAnElementInAnArrayWithSorting(){
        int[] arr = {4,3,7,1,2,8,9};
        Arrays.sort(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is present or not in array: ");
        int num = scanner.nextInt();
        // write code to find the number
        System.out.println("Number not found in array");
    }
}
