package recursions;

public class SortedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
        solution(arr,0);

    }
    static boolean solution(int [] arr, int index){
        if (index == arr.length-1 ){
            return true;
        }
        if (index < arr.length )
        return solution(arr,index+1);


    }
}
