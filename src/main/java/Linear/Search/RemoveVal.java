package Linear.Search;
//Question link : https://leetcode.com/problems/remove-element/
public class RemoveVal {
    public static void main(String[] args) {
    int [] nums = {0,1,2,2,3,0,4,2};
    int val =2;
    Remove(nums,val);
    }
    static int Remove(int [] nums, int val){
        int k = 0;
        for (int i : nums){
            if (i != val){
                nums[k] = i;
                k++;
            }
        }
        return k;
    }
}
