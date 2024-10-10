package Selection.Sort;

import java.util.Arrays;

//Question link : https://leetcode.com/problems/sort-an-array/description/
public class Questionone {
    public static void main(String[] args) {
        int [] nums = {5,1,1,2,0,0};
        selectionSort(nums);
    }
    static void selectionSort(int [] nums){
        for (int i = 0; i< nums.length;i++){

            int lastIndex = nums.length-i-1;
            int maxElement = FindMax(nums,0,lastIndex);
            if (maxElement != lastIndex){
                int temp = nums[lastIndex];
                nums[lastIndex]=nums[maxElement];
                nums[maxElement] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static int FindMax(int [] arr, int s, int e){
        int max = s;
        for (int i = s; i <= e;i++){
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
