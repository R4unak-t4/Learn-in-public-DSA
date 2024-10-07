package org.example;

import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {3,4,2,6,5};
        Bubble(arr);
    }
    static void Bubble(int [] nums){

        for (int i = 0; i < nums.length;i++){
            for (int j = 1; j < nums.length-i;j++){
                if ( nums[j] < nums[j-1]){
                    int temp;
                    temp = nums[j];
                    nums[j] = nums[j-1] ;
                    nums[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
