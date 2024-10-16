package Cycle.Sort;

import java.util.ArrayList;
import java.util.List;

//Question : https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class FindMultiDups {
    public static void main(String[] args) {

    }
    static List<Integer> cycleSort(int [] nums){
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while(i < nums.length){
            int correct = nums[i]-1;
            if (i == correct){
                i++;
            } else if (nums[i] == nums[correct]) {
                if (ans.contains(nums[i])){
                    i++;
                }else {
                    ans.add(nums[i]);
                }

            }else {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }

        }
        return ans;
    }
}
