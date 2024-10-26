package Merge.Sort;

import java.util.Arrays;

public class BaseCode {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,6,5};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int [] mergeSort(int [] arr){
        if(arr.length == 1){
            return arr;
        }
        int m = arr.length/2;
        int [] left = mergeSort(Arrays.copyOfRange(arr,0,m));
        int [] right = mergeSort(Arrays.copyOfRange(arr,m,arr.length));

        return merge(left,right);
    }
    static int [] merge(int [] left, int [] right){
        int [] mergedArr = new int[left.length+ right.length];
        int l = 0;
        int r = 0;
        int k =0;
        while (l< left.length && r< right.length){
            if (left[l] > right[r]){
                mergedArr[k] = right[r];
                r++;
                k++;
            }else {
                mergedArr[k] = left[l];
                l++;
                k++;
            }
        }
        while (l< left.length){
            mergedArr[k] = left[l];
            l++;
            k++;
        }
        while (r< right.length){
            mergedArr[k] = right[r];
            r++;
            k++;
        }
        return mergedArr;
    }
}
