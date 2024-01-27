package array;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {4,3,7,1,2,8,9};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
