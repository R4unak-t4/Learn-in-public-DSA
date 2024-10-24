package recursions;

import java.util.ArrayList;
import java.util.List;

public class dualoccurance {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,4};
    List<Integer> ans = new ArrayList<>();
    int t = 4;
    System.out.println(search(arr,0,t,ans));


    }
    static List<Integer> search(int[] arr, int i, int t, List<Integer> ans){
        if(arr[i] == t){
            ans.add(i);
        }
        if (i == arr.length-1){
            return ans;
        }
        return search(arr,i+1,t,ans);


    }
}
