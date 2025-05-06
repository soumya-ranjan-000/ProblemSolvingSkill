package sorting.SelectionSort;


public class Main {

    public static void main(String[] args) {
        int[] arr = { 29, 78, 98, 13, 87, 66, 52, 51, 36 };
        selectionSort(arr);
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i]+" ");
            i++;
        }
    }

    static void selectionSort(int[] array) {
        int lenOfArray = array.length;
        for (int i = 0; i < lenOfArray - 1; i++) {
            int minValue = array[i];
            int minValueIndex = i;
            int temp = 0;
            for (int j = i + 1; j < lenOfArray; j++) {
                if (minValue > array[j]) {
                    minValue = array[j];
                    minValueIndex = j;
                }
            }
            temp = array[i];
            array[i] = minValue;
            array[minValueIndex] = temp;
        }
    }
}
