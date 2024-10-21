package recursions;

public class NTo1 {
    public static void main(String[] args) {
        Solution(5);

    }
    static void Solution(int n){
        if (n >0){
            System.out.println(n);
            Solution(n-1);
        }


    }
}
