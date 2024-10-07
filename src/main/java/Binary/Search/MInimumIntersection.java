package Binary.Search;
//Question : https://leetcode.com/problems/minimum-common-value/?envType=problem-list-v2&envId=binary-search
public class MInimumIntersection {
    public static void main(String[] args) {
        int [] num1 ={1,1,2};
        int [] num2 = {2,4};
        System.out.println(BinarySearch(num1,num2));
    }
    static int BinarySearch(int [] nums1, int [] nums2){
        int s1 = 0, s2 = 0, e1 = nums1.length-1, e2 = nums2.length-1;
        while (s1<=e1 && s2<=e2){
            if (nums1[s1] == nums2[s2]){
                return nums1[s1];
            }
            if (nums1[s1]<nums2[s2]) {
                s1++;
            }else {
                s2++;
            }
            if (nums1[e1]<nums2[e2]){
                e2--;
            }else {
                e1--;
            }
        }
        return -1;
    }
}
