package recursions;
//Question : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class Leetcode1342 {
    public static void main(String[] args) {
        System.out.println(solution(14));
    }
    static int solution(int num){
    if (num == 0){
        return 0;
    }
    if (num%2 == 0){
        return 1 + solution(num/2);
    }else {
        return 1+ solution(num-1);
    }
    }
}


//by using iterations
//int steps = 0;
//        while (num >=1 ){
//        if (num%2 == 0){
//num = num/2;
//steps++;
//        }else {
//num = num -1;
//steps++;
//        }
//        }
//        return steps;