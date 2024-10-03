package Binary.Search;
//Question link : https://leetcode.com/problems/find-in-mountain-array/description/
public class FindinMountainArray {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,3,1};
    int target = 3;
        System.out.println(search(arr,target));
    }
    static int search(int arr[], int target){
        int peak = PeakSearch(arr,target);
        int firsttry = findans(arr,0,peak,target);
        if (firsttry != -1){
            return firsttry;
        } else {
            findans(arr,peak,arr.length -1,target);
        }
        return firsttry;

    }
    static int findans(int arr[],int s,int e,int target) {
        int m, ans = -1;
        boolean isAsc = s < e;
            while (s <= e) {
                m = s + (e - s) / 2;
                if (arr[m] == target) {
                    ans = m;
                }
                if (isAsc) {
                    if (arr[m] > target) {
                        e = m - 1;
                    } else {
                        s = m + 1;
                    }
                } else {
                    if (arr[m] < target) {
                        e = m - 1;
                    } else {
                        s = m + 1;
                    }
                }

            }

        return ans;
    }
    static int PeakSearch(int [] arr,int target){
        int s = 0, e = arr.length-1; //Defining start and end
        int m;
        while (s < e){
            m = s+(e-s)/2; // finding out the middle element
            if (arr[m]> arr[m+1]){
                e = m;
            } else {
                s= m+1;
            }
        }
        return s;
    }
}


