package Cycle.Sort;

import java.util.ArrayList;
import java.util.List;

//Question: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class FindMIssingDups {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(CycleSort(arr));
    }
    static List<Integer> CycleSort(int [] nums){
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i<nums.length){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else {
                i++;
            }
        }
        for (int e = 0; e< nums.length;e++){
            if (nums[e]-1 != e){
                ans.add(e+1);
            }
        }
        return ans;
    }
}
