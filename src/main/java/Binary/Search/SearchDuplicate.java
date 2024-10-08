package Binary.Search;

import java.util.Arrays;
//Not the best time complexity
//Question : https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/?envType=problem-list-v2&envId=binary-search
public class SearchDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(CheckDuplicate(nums));
    }
    static boolean CheckDuplicate(int[]nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1;i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
