import java.util.*;
public class Practice {

    // Q1. reverse array element-----
   /* static void revArr(int Arr[]  , int idx){
        if(idx < 0){
            
            return;
        }
        System.out.print(" " + Arr[idx]);
        revArr(Arr, idx-1);
    }*/

    //Q2. find minimum in Array----------
    // static int findMin(int Arr[], int idx ){
    //     if(idx == 0 ){
    //         return Arr[0];
    //     }
    //     return Math.min(Arr[idx-1], findMin(Arr, idx-1)); 
    // }

    //Q3. find maximum in Array-----
    // static int findMax(int Arr[], int idx ){
    //     if(idx == 0 ){
    //         return Arr[0];
    //     }
    //     return Math.max(Arr[idx-1], findMax(Arr, idx-1)); 
    // }


    public static void main(String[] args) {
        
         int Arr[] = {9,2,3,4,0,6};
         int idx = Arr.length -1;
         
        //Ans1----
        //  revArr(Arr, idx);

        //Ans2----
        // System.out.println(findMin(Arr, idx));

        //Ans3----
        System.out.println(findMax(Arr, idx));
        
    }
}
