package Cycle.Sort;
//Question : https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {0,1};
        System.out.println(cycleSort(arr));
    }
    static int cycleSort(int [] nums){
        int i = 0;
        int e =0;
        while (i<nums.length){
            int correct = nums[i];
            if (i == correct){
                i++;
            }else if (nums[i]> nums.length-1){
                i++;
            }else {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }

        for (e = 0; e< nums.length;e++){
            if (nums[e]!=e){
                return e;
            }
        }
        return e;
    }
}
