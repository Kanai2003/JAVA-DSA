
import java.util.*;
public class pattern {
     public static void main(String[] args) {
        
     
        // System.out.println("hello world");
        // System.out.println("my name is kanailal Manna");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        
        }
    }
}
