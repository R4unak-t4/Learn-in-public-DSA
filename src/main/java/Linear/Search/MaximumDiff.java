package Linear.Search;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumDiff {
    public static void main(String[] args) {
        int [] nums = {3,6,9,1};
        System.out.println(Maxgap(nums));
    }
    static int Maxgap(int[] nums){

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
