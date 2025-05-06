package sorting.bubblesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,6,2,8,9,4,10};
        boolean swap = false;
        for(int i = 0; i< nums.length; i++){
            for(int j = 0; j < nums.length-i-1 ; j++){
                if(nums[j] > nums[j+1]){
                    int temp =nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j] = temp;
                    swap=true;
                }
            }
            if(!swap) break;
        }
        System.out.println(Arrays.toString(nums));
    }
}
