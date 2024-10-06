package Binary.Search;

// Question : https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

public class RotatedArrayII {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        System.out.println(Answer(nums, target));
    }

    static boolean Answer(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int s = 0, e = nums.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] == target) {
                return true;
            }

            // If we can't determine which side is sorted (due to duplicates)
            if (nums[s] == nums[m] && nums[m] == nums[e]) {
                s++;
                e--;
            }
            // Left part is sorted
            else if (nums[s] <= nums[m]) {
                if (nums[s] <= target && target < nums[m]) {
                    e = m - 1;  // target is in the left sorted half
                } else {
                    s = m + 1;  // target is in the right half
                }
            }
            // Right part is sorted
            else {
                if (nums[m] < target && target <= nums[e]) {
                    s = m + 1;  // target is in the right sorted half
                } else {
                    e = m - 1;  // target is in the left half
                }
            }
        }

        return false;  // target is not found
    }
}
