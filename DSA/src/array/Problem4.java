package array;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {4,3,7,1,2,8,9};
        float avg = (Arrays.stream(arr).sum())/ arr.length;
        System.out.println(avg);
    }
}
