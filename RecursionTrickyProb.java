import java.util.*;
public class RecursionTrickyProb{
    public static void fun(int n){
        if( n == 0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number ");
        int n = sc.nextInt();
        fun(n);
        
    }
}