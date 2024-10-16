package Cycle.Sort;

import java.util.ArrayList;
import java.util.List;

//Question : https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class FindMultiDups {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(cycleSort(arr));
    }
    static List<Integer> cycleSort(int [] nums){
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i<nums.length){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else if (nums[i] == nums[correct]){
                i++;
            }else {
                i++;
            }
        }
        for (int e = 0; e< nums.length;e++){
            if (nums[e]-1 != e){
                ans.add(nums[e]);
            }
        }
        return ans;
    }
}
