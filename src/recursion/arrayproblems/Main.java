package recursion.arrayproblems;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,4,8,8,8,10,12};
        System.out.println(isSorted(nums,0));
        System.out.println(findIndex(nums,0,8));
        System.out.println(findLastIndex(nums,nums.length-1,8));
    }

    static boolean isSorted(int[] arr, int index){
        if(index<arr.length-1){
            if(!(arr[index]<=arr[index+1])){
                return false;
            }else{
                return isSorted(arr,index+1);
            }
        }else{
            return true;
        }
    }

    static int findIndex(int[] arr,int index, int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index] == target) return index;
        return findIndex(arr,index+1,target);
    }

    static int findLastIndex(int[] arr,int index, int target){
        if(index<0){
            return -1;
        }
        if(arr[index] == target) return index;
        return findLastIndex(arr,index-1,target);
    }
}
