package org.example;
//Question : https://leetcode.com/problems/sort-colors/description/
public class ColourSort {
    public static void main(String[] args) {
        int [] nums ={2,0,2,1,1,0};
        BubbleSort(nums);
    }
    static void BubbleSort (int [] nums){
        for (int i = 0; i< nums.length;i++){
            for (int j = 1; j < nums.length-i;j++){
                if (nums[j]<nums[j-1]){
                    int temp;
                    temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
