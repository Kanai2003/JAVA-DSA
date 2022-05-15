
import java.util.*;
public class pattern {
     public static void main(String[] args) {
        
     
        // System.out.println("hello world");
        // System.out.println("I'm K");
        Scanner sc = new Scanner(System.in);
        
        // int a = sc.nextInt();
        // for(int i=1; i<=a; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        
        // }
        
        System.out.println("Enter size of matrix :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int arr[][]=new int[x][y] ;
        
        for(int i=0;i<x;i++){
            System.out.println("Enter value of Array["+i+"]  :");
            for(int j=0;j<y;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n");
        for(int i =0; i <arr.length;i++){
            int s=i;
            int l=arr.length-i-1;
            do{
                if(s<l){
                    System.out.print(arr[i][s]+" ");
                    s++;
                }else if(l<s){
                    System.out.print(arr[i][l]+" ");
                    l++;
                }else  {
                    System.out.print(arr[i][s]);
                    break;
                }

            }while(s<=l || l<=s);
            System.out.println();
        }
    }
}
