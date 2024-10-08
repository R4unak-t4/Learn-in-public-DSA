package Linear.Search;

//Question link : https://leetcode.com/problems/maximum-gap/submissions/1415930702/
import java.util.Arrays;

public class MaximumDiff {
    public static void main(String[] args) {
        int [] nums = {3,6,9,1};
        System.out.println(Maxgap(nums));
    }
    static int Maxgap(int[] nums){
        if (nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int ans = -1, i = nums.length-2;
        while (i>=0){
            int diff = nums[i+1] - nums[i];
            if (diff>=ans){
                ans = diff;
            }
            i--;
        }
        return ans;
    }
}
