
import java.util.*;

public class MargeSort {

    
    
    
    public static void divide(int arr[] , int start , int end){
        if(start >= end){
            return;
        }
        
        int mid  = start + (end - start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conqure(arr,start,mid,end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        for(int i = 0; i<size ; i++){
            System.out.print("Enter Array["+i+"] :");
            arr[i] = sc.nextInt();
        }
        
        divide(arr, 0, size-1);
        for(int i = 0; i<size ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
} 
