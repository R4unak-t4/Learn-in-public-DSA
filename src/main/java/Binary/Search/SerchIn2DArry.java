package Binary.Search;

import java.util.Arrays;

public class SerchIn2DArry {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[][]{{10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}

        };
        int target = 37;

        System.out.println(Arrays.toString(BinarySearch(arr, target)));;
    }
    static int [] BinarySearch(int [][] arr,int target){
        int rs = 0 , re = arr.length-1;
        int [] ans = {-1,-1};

        while (rs<=re){
            int rm = rs + (re - rs)/2;
            int ce = arr[rm].length-1;
            if (arr[0][ce] > target){
                ce = ce-1;
            }
            if (arr[rm][0] < target){
                rs = rm +1;
            }
            if (arr[rm][ce] == target){
                ans = new int[]{rm, ce};
                return  ans;
            }else if(arr[rm][ce] < target ){
                rs = rm+1;
            }else if (arr[rm][0] <= target && arr[rm][ce] > target){
                if (arr[rm][0] == target){
                    ans = new int[]{rm, 0};
                    return  ans;
                }
                int s = 1, e = ce-1;
                while (s<=e){
                    int m = s+(e-s)/2;
                    if (arr[rm][m] == target){
                        ans = new int[]{rm, m};
                        return  ans;
                    }else if(arr[rm][m] < target){
                        s = m+1;
                    }else {
                        e = m-1;
                    }
                }
            }



        }
        return ans;
    }
}
