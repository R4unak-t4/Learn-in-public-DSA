package Binary.Search;

//Question Link : https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedArray {
    public static void main(String[] args) {
    int [] nums = {4,5,6,7,0,1,2};
    int target = 0;
        System.out.println(search(nums,target));
    }
    static int search(int [] nums, int target){
        int pivot = pivotFind(nums);
        if (pivot == -1){
            return pivot;
        }
        if (pivot == target){
            return pivot;
        }else if(nums[0] > target){
            return BinarySearch(nums,pivot+1,nums.length-1,target);
        }else if (nums[0] < target){
            return BinarySearch(nums,0,pivot-1,target);
        }
        return -1;
    }
    static int BinarySearch(int [] nums, int s, int e, int target){
        int ans = -1;
        int m;
        while (s <= e){
            m = s+(e-s)/2;
            if (nums[m] == target){
                ans = m;
                return ans;
            }else if(nums[m]> target){
                e = m-1;
            }else {
                s = m+1;
            }
        }
        return ans;

    }
    static int pivotFind(int [] nums){
        int s = 0, e = nums.length -1;
        int m, pivot = -1;
        while (s <= e){
            m = s+(e-s)/2;
            if (nums[m] > nums[m+1] && m <e){
                pivot = m;
                return pivot;
            }else if (nums[m] < nums[m-1]){
               return m-1;
            }else if (nums[m] <= nums[s]){
                e = m-1;
            }
        }
        return pivot;
    }
}
