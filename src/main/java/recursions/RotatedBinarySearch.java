package recursions;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,1,2,3,4};
        int t = 7;
        System.out.println(BinarySearch(arr,0,arr.length-1,t));
    }
    static int BinarySearch(int [] arr,int s,int e,int t){
        int m = s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if (arr[m] == t){
            return m;
        } else if (arr[m] > arr[s]) {
            if (arr[s] < t && arr[m]>t){
                e = m-1;
            } else if (arr[s]>t ) {
                s = m+1;

            }
        }
        return -1;
    }
}
