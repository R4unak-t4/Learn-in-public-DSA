package Linear.Search;
//You can Tweak the Answer by merging using copy but the leet code won;t accept it
import java.util.Arrays;
//Question: https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSort {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        System.out.println(Arrays.toString(Merge(nums1,nums2,m,n)));
    }
    static int [] Merge(int [] nums1, int [] nums2, int m, int n){
        int i = m - 1;
        int j = n - 1;
        int k = (m+n) - 1;
        while (i >=0 && j >=0){
            if (nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        return nums1;
    }
}
