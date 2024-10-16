package Cycle.Sort;
//Question : https://leetcode.com/problems/first-missing-positive/description/
public class FindMinMIssing {
    public static void main(String[] args) {
        int [] arr = {7,8,9,11,12};
        System.out.println(cycleSort(arr));
    }
    static int cycleSort(int [] nums){
        int i = 0;
        while (i< nums.length){
            int correct = nums[i]-1;
            if ((correct< nums.length && nums[i]>0) && i!=correct){
                int temp =nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            }else {
                i++;
            }
        }

        for (int e = 0; e< nums.length;e++){

            if (nums[e] != e+1){
                    return e + 1;


            }
        }
        return nums.length+1;
    }
}
