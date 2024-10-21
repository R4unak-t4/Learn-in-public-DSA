package recursions;

public class OneToN {
    public static void main(String[] args) {
        solution(5);
    }
    static void solution(int n){
        if (n == 0){
            return;
        }
        solution(n-1);
        System.out.println(n);

    }
}
