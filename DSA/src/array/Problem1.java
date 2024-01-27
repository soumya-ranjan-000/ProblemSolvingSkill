package array;

import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {4,3,7,1,2,8,9};
        arr = sortNumericArray(arr);
        System.out.println(Arrays.toString(arr));

        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        my_array2 = sortStringArray(my_array2);
        System.out.println(Arrays.toString(my_array2));
    }

    static int[] sortNumericArray(int[] arr){
        // solution 1

//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length-1;j++){
//                if(arr[j] > arr[j+1]){
//                    int temp=arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        // solution 2
        Arrays.sort(arr);

        return arr;
    }

    static String[] sortStringArray(String[] arr){
        Arrays.sort(arr);
        return arr;
    }
}
