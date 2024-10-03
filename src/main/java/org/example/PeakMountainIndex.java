package org.example;
//Question Link : https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakMountainIndex {
    public static void main(String[] args) {
        int [] arr = {0,10,5,2};
        System.out.println(PeakSearch(arr));
    }
    static int PeakSearch(int [] arr){
        int s = 0, e = arr.length-1; //Defining start and end
        int m;
        while (s <= e){
            m = s+(e-s)/2; // finding out the middle element
            if (arr[m]> arr[m-1] && arr[m]> arr[m+1]){ // checking if the element is peak
               return m; // if the element is greater than it's neighbour element it is peak
            } else if (arr[m] > arr[m+1] && arr[m] < arr[m-1]) {
                e = m-1; // if the element is greater than next element look to left
            }else if (arr[m] < arr[m+1] && arr[m] > arr[m-1]) {
                s = m+1;// if the element is greater than previous element look to right
            }
        }
        return -1;
    }
}
// submitted code to leetcode
// class Solution {
//    public int peakIndexInMountainArray(int[] arr) {
//        int s = 0, e = arr.length-1; //Defining start and end
//        int m;
//        while (s <= e){
//            m = s+(e-s)/2; // finding out the middle element
//            if (arr[m]> arr[m-1] && arr[m]> arr[m+1]){ // checking if the element is peak
//               return m; // if the element is greater than it's neighbour element it is peak
//            } else if (arr[m] > arr[m+1] && arr[m] < arr[m-1]) {
//                e = m-1; // if the element is greater than next element look to left
//            }else if (arr[m] < arr[m+1] && arr[m] > arr[m-1]) {
//                s = m+1;// if the element is greater than previous element look to right
//            }
//        }
//        return -1;
//}
//}