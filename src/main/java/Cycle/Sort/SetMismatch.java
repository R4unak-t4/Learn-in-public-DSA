package Cycle.Sort;

import java.util.Arrays;

//Question : https://leetcode.com/problems/set-mismatch/description/
public class SetMismatch {
    public static void main(String[] args) {
        int [] arr = {1,2,2,4};
        System.out.println(Arrays.toString(CycleSort(arr)));
    }
    static int [] CycleSort(int [] nums){
        int i = 0;
        int [] ans = new int[2] ;
        while (i< nums.length) {
            int correct = nums[i]-1;
            if (i ==correct){
                i++;
            }else if (nums[i] == nums[correct]){
                i++;
            }else {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }
        for (int e = 0; e< nums.length;e++){
            if (nums[e] != e+1 ){
                ans[0] = nums[e];
                ans[1] = e+1;
            }
        }
        return ans;
    }
}
