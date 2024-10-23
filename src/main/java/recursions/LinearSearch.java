package recursions;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,4,7,10};
        int target = 12;
        System.out.println(Search(arr,0,target));
    }
    static int Search(int [] arr, int i,int target){
        if(arr[i] == target){
            return arr[i];
        }
        if(i == arr.length-1){
            return -1;
        }
        return Search(arr,i+1,target);

    }
}
