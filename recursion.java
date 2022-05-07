import java.util.*;
public class recursion{
    // public static void sumOfNumber(int n,int result){
    //     if(n == 0){
    //         System.out.println(result);
    //         return;
    //     }
    //     sumOfNumber(n-1,  result += n;);
    // }



    // This is a very iteresting problem ---------------------------
    public static void fun(int n){
        if( n == 0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }


  
        
    
       
    
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.err.println("fitst enter number and then power");
        // int n = sc.nextInt();
        // int x = sc.nextInt();
        // // sumOfNumber(n, 0);


        fun(5);
        
    }
}