package Binary.Search;
//Question Link : https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakMountainIndex {
    public static void main(String[] args) {
        int [] arr = {0,10,5,2};
        System.out.println(PeakSearch(arr));
    }
    static int PeakSearch(int [] arr){
        int s = 0, e = arr.length-1; //Defining start and end
        int m;
        while (s < e){
            m = s+(e-s)/2; // finding out the middle element
            if (arr[m]> arr[m+1]){ // checking if the element is peak
               e = m;
            } else {
                s= m+1;
            }
        }
        return s;
    }
}
