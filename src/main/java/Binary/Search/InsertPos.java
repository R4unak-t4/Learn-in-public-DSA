package Binary.Search;
// Question : https://leetcode.com/problems/search-insert-position/
public class InsertPos {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 2;
        System.out.println(BinarySearch(nums,target));
    }
    static int BinarySearch(int [] nums,int target){
        int s = 0, e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        // If the target was not found, return the index where it should be inserted
        return s;
    }
}
