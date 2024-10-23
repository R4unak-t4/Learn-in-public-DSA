package recursions;

public class SortedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
        int ans = solution(arr,0);
        if (ans != 0){
            System.out.println("Array is not sorted");
        }else {
            System.out.println("Array is sorted");
        }
    }
    static int solution(int [] arr, int index){
        if (index == arr.length-1 ){
            return 0;
        }
        if (index< arr.length && arr[index] >= arr[index+1]){
            return 1;
        }
        return solution(arr,index+1);


    }
}
