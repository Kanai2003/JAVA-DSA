
import java.util.*;

public class SortMarge {

    
    
    public static void conqure(int arr[],int start, int mid, int end) {
        int mar[]=new int[end -start+1];
        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;
        while(idx1 <= mid && idx2 <= end){      
            if(arr[idx1] <= arr[idx2]){
                mar[x++] = arr[idx1++];
            }else{
                mar[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid){
            mar[x++] = arr[idx1++];
        }

        while (idx2 <= end){
            mar[x++] = arr[idx2++];
        }

        for(int i=0,j=start ; i < mar.length ; i++,j++){
            arr[j]= mar[i];
        }
    }

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