package Linear.Search;
//Question : https://leetcode.com/problems/find-closest-number-to-zero/

public class ClosestNumberToZero {
    public static void main(String[] args) {
    int [] arr = {2,-1,1};
        System.out.println(FindNUmber(arr));
    }
    static int FindNUmber(int[] nums){
        int ans = nums[0];
        for (int i : nums){
            if (Math.abs(i) < Math.abs(ans) || (Math.abs(i) == Math.abs(ans) && i > ans)){
                ans = i;
            }
        }
        return ans;
    }
}
