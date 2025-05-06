package array;

import java.util.Arrays;

public class BasicProblem {
    public static void main(String[] args) {
        int[] numbers = { 12, 45, 10, -1, -10 };
        int[] numbersArr = { -1000, -1, 10, 12, 45 };
        System.out.println(findMaxProduct(numbersArr));
        System.out.println(findMaxProduct(numbers));
    }

    static int findMaxProduct(int[] arr) {
        Arrays.sort(arr);
        // array is sorted
        int firstThreeElementAndLastOneProduct = arr[0] * arr[1] * arr[arr.length - 1];
        int lastThreeElemtsProduct = arr[arr.length - 3] * arr[arr.length - 2] * arr[arr.length - 1];
        if (firstThreeElementAndLastOneProduct > lastThreeElemtsProduct) {
            return firstThreeElementAndLastOneProduct;
        } else {
            return lastThreeElemtsProduct;
        }
    }
}
