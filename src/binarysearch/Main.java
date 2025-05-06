package binarysearch;

import java.util.Arrays;

public class Main {


    static void problem1() {
        //744. Find Smallest Letter Greater Than Target
        char[] letters = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters, 'c'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        if (target >= letters[right]) return letters[0];
        int mid = -1;
        while (left <= right) {
            mid = right + (left - right) / 2;
            if (target > letters[mid]) left = mid + 1;
            else if (target < letters[mid]) right = mid - 1;
            else {
                if (letters[mid + 1] == target) {
                    while (mid <= letters.length - 1) {
                        if (letters[mid] != target) return letters[mid];
                        else mid++;
                    }
                } else return letters[mid + 1];
            }
        }
        return letters[left];
    }

    static void problem2() {
        //34. Find First and Last Position of Element in Sorted Array
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
        target = 6;
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (nums.length == 1 && nums[0] == target) return new int[]{0, 0};
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > nums[mid]) left = mid + 1;
            else if (target < nums[mid]) right = mid - 1;
            else {
                int first = mid; //4
                int last = mid; //4
                while (last < nums.length - 1) { //4<5
                    if (nums[last] == nums[last + 1]) last++;
                    else break;
                }
                while (first > 0) {
                    if (nums[first] == nums[first - 1]) first--;
                    else break;
                }
                return new int[]{first, last};
            }
        }
        return new int[]{-1, -1};
    }

    public static int findNumberInAnSortedInfinityArray(int[] nums, int target) {
        int left = 0;
        int right = 1;
        while (target > nums[right]) {
            int windowSize = 2 * (right - left + 1);
            left = right + 1;
            right = right + windowSize;
        }
        return binarySearch(nums, target, left, right);
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    static void problem3() {
        int[] nums = {2, 3, 5, 7, 8, 9, 11, 12, 15, 19, 24, 28, 31, 45, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88};
        int target = 2;
        int res = findNumberInAnSortedInfinityArray(nums, target);
        System.out.println("nums[" + res + "] -> " + nums[res]);
    }

    static void problem4() {
        int[] arr = new int[]{0, 1, 0};
        arr = new int[]{0, 2, 1, 0};
        arr = new int[]{3, 5, 3, 2, 0};
        int res = peakIndexInMountainArray(arr);
        System.out.println("nums[" + res + "] -> " + arr[res]);

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == 0) return mid + 1;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
            else if (arr[mid] > arr[mid - 1]) {
                //number is left side
                left = mid + 1;
            } else {
                //number is on right side
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void problem5() {
//        33. Search in Rotated Sorted Array
        int[] arr = new int[]{4, 5, 6, 7, 0, 1, 2};
        int ind = search(arr,7);
        System.out.println(ind);
    }

    public static int search(int[] nums, int target) {

        int first = 0;
        int last = nums.length - 1;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (target == nums[mid]) return mid;
            if (nums[first] <= nums[mid]) { // left half is sorted
                if (target >= nums[first] && target < nums[mid]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            } else { //  right half is sorted
                if (target > nums[mid] && target <= nums[last]) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }
        }
        return -1;
    }

//    public int findInMountainArray(int target, MountainArray m) {
//        //find the peak element
//        int peakElementIndex = -1;
//        int left = 0;
//        int right = m.length() - 1;
//        int mid = -1;
//        int midEle = -1;
//        while (left <= right) {
//            mid = left + (right - left) / 2;
//            midEle = m.get(mid);
//            int beforeMidEle = m.get(mid - 1);
//            int afterMidEle = m.get(mid + 1);
//            if (midEle > beforeMidEle && midEle > afterMidEle) peakElementIndex = mid;
//        }
//
//        // try to search element in left half of peak element
//        left = 0;
//        right = peakElementIndex;
//        while (left <= right) {
//            mid = left + (right - left) / 2;
//            midEle = m.get(mid);
//            if (target > midEle) left = mid + 1;
//            else if (target < midEle) right = mid - 1;
//            else return mid;
//        }
//
//        //if not found, try to search in right half of peak element. note elements will be in descending order
//        left = peakElementIndex;
//        right = m.length() - 1;
//        while (left <= right) {
//            mid = left + (right - left) / 2;
//            midEle = m.get(mid);
//            if (target > midEle) right = mid - 1;
//            else if (target < midEle) left = mid + 1;
//            else return mid;
//        }
//        return -1;
//    }

    public static void main(String[] args) {
//        problem1();
//        problem2();
//        problem3();
//        problem4();
        problem5();
    }
}
