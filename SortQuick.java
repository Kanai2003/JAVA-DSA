import java.util.*;
public class SortQuick {

    public static int partition(int arr[]  , int low , int high ){
        int pivot = arr[high];
        int i = low - 1;
        for(int  j = low; j<high ; j++){
            //Swapping all smaller element in left side 
            if(arr[j] < pivot){
                i++;
                int temp  = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swapping pivot in actual place 
        i++;
        int temp  = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void sort(int arr[],int low , int high){
        if(low < high){
            int pi = partition(arr, low , high);
            sort(arr, low, pi-1);
            sort(arr, pi+1,high);
        }
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        //taking array as input
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        for(int i = 0; i<size ; i++){
            System.out.print("Enter Array["+i+"] : ");
            arr[i] = sc.nextInt();
        }

        //sorting 
        sort(arr, 0, size-1);

        //printing the sorted array
        for(int i = 0; i<size ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}