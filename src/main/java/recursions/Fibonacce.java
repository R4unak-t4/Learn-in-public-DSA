package recursions;

public class Fibonacce {
    public static void main(String[] args) {

    }
    static int Solution(int n){
        if (n < 2){
            return n;
        }
        return Solution(n-1) + Solution(n-2);

    }
}
