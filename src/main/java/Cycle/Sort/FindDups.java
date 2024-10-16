package Cycle.Sort;
//Questiom : https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindDups {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        System.out.println(CycleSort(arr));
    }
    static int CycleSort(int []nums){
        int i = 0;
        while (i< nums.length){
            int correct = nums[i]-1;
            if (i == correct){
                i++;
            }else if (nums[i] == nums[correct]){
                return nums[i];
            }else {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }
        return -1;
    }
}
