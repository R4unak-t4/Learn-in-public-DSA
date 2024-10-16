package Cycle.Sort;
//Question : https://leetcode.com/problems/set-mismatch/description/
public class SetMismatch {
    public static void main(String[] args) {

    }
    static int [] CycleSort(int [] nums){
        int i = 0;
        int [] ans ={-1,-1};
        while (i< nums.length){
            if(nums[i]-1 == i){
                i++;
            } else {
                ans[0]= nums[i];
                ans[1]= i+1;
                return ans;
            }
        }
        return ans;
    }
}
