package recursions;
import java.util.ArrayList;
import java.util.List;

public class Withoutargument {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,4};
        int t = 4;
        System.out.println(search(arr,0,t));
    }
    static List<Integer> search(int [] arr,int i, int t){
        List<Integer> ans = new ArrayList<>();
        if(i == arr.length){
            return ans;
        }
        if (arr[i] == t){
            ans.add(i);
        }
        List<Integer> belowans = search(arr,i+1,t);
        ans.addAll(belowans);
        return ans;

    }
}
