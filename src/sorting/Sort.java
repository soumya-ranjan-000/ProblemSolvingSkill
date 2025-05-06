package sorting;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] number=new int[]{5,4,3,2,1,0,-1};
//        System.out.println(Arrays.toString(number));
        insertionSort(number);
        System.out.println("Final: "+Arrays.toString(number));
    }
    static void insertionSort(int[] list){
        for(int i=1;i<list.length;i++){
            System.out.println("Before: i("+i+"): "+Arrays.toString(list));
            for(int j=i;j>0 && (list[j-1]>list[j]);j--){
                int temp=list[j];
                list[j]=list[j-1];
                list[j-1]=temp;
                System.out.println("\tj("+j+"): "+Arrays.toString(list));
            }
            System.out.println("After: i("+i+"): "+Arrays.toString(list));
        }
    }
}
