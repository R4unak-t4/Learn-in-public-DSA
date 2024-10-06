package Binary.Search;
//Question : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class minInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {11, 13, 15, 17};
        System.out.println(PivotFind(nums));
    }

    static int PivotFind(int[] nums) {
        int s = 0, e = nums.length - 1;
        int m;
        if (nums[s] <= nums[e]) {
            return nums[s];
        }
        while (s <= e) {
            m = s + (e - s) / 2;
            if (m > 0 && nums[m] < nums[m - 1]) {
                return nums[m];
            }
            if (m < nums.length - 1 && nums[m] > nums[m + 1]) {
                return nums[m + 1];
            }
            if (nums[m] >= nums[s]) {
                s = m + 1;
            } else {
                e = m-1;
            }

        }
        return -1;
    }
}
