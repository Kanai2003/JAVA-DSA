import java.util.*;
public class SumUptoNum {

    public static void sumOfNumber(int n,int result){
        if(n == 0){
            System.out.println(result);
            return;
        }
        sumOfNumber(n-1,  result += n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number :");
        int n = sc.nextInt();
        sumOfNumber(n, 0);

    }
}
