import java.util.*;
import java.util.Arrays;

public class AditionalRoughWork {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);


        // String input = sc.nextLine();
        
        // String leftShift = input.substring(1, input.length() );
        // String rightShift = input.substring(0, input.length() - 1);    
        
        // if(leftShift.equals(rightShift)){
        //     System.out.println(1);

        // }else{
        //     System.out.println(0);
        // }


        // int n = sc.nextInt();
        // for(int i = 2; i <= n; i++) {
        //     if(isPrime(i) == true){
        //         System.out.println(i);
        //     }
        // }
        
            // int n = sc.nextInt();
            // int k = sc.nextInt();
            // int arr[] = new int[n];
            // for(int i = 0; i < n; i++) {
            //     arr[i] = sc.nextInt();
            // }
            // Arrays.sort(arr);
            // int sum = 0;
           
            // for(int i = k ; i<n-k;i++){
            //     sum += arr[i]; 
            // }
            // float avg = (float)sum / (n - 2*k);
            // System.out.printf("%.5f", avg);
            // // 5 1
            // // 2 9 -10 25 1
            // // -10 1 2 9 25 

    // }

    // public static boolean isPrime(int n){
    //     for(int j = 2; j <= n/2; j++) {
    //         if(n%j == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }






    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     int testcase = input.nextInt();
    //     int[] nn = new int[testcase];
    //     int[] kk = new int[testcase];
    //     for (int i = 0; i < testcase; i++) {
    //         nn[i] = input.nextInt();
    //         kk[i] = input.nextInt();
    //     }
        
    //     for (int j = 0; j < testcase; j++) {
    //         int n = nn[j];
    //         int k = kk[j];
    //         int[] arr = new int[n];
    //         for (int i = 0; i < n; i++) {
    //             arr[i] = i + 1;
    //         }
    //         for (int i = 0; i < k; i++) {
    //             ruffle(arr);
    //         }
    //         System.out.println(Arrays.toString(arr));
    //     }
    // }

    // static void ruffle (int[] arr) {
    //     int index = 0;
    //     for (int i = 1; i < arr.length / 2; i++) {
    //         index++;
    //         int temp = arr[index + i];
    //         for (int j = i; j > 0; j--) {
    //             arr[index + j] = arr[index + j - 1];
    //         }
    //         arr[index] = temp;
    //     }
    // }



    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int tt = sc.nextInt();
    //     int nn[] = new int[tt];
    //     int kk[] = new int[tt];
    //     for(int  i= 0; i<tt ; i++){
    //         nn[i] = sc.nextInt();
    //         kk[i] = sc.nextInt();
    //     }
    //     for(int i = 0; i <tt ; i++){
    //         int n  = nn[i];
    //         int k = kk[i];
    //         int arr [] = new int[n];
    //         for(int j = 0; j < n ; j++){
    //             arr[j] = j+1 ;
    //         }
    //         for(int j = 0 ; j < k ; j++){
    //             ruffle(arr);
    //         }
    //         System.out.println(Arrays.toString(arr));
    //     }
    // }
    // public static void ruffle(int[] arr){
    //     int c = 0;
        
    //     for(int i = 0 ; i < arr.length ; i+=2){
    //         int temp = arr[i];
    //         int j = i;
    //         while(  j> i-c ){
    //              arr[j] = arr[j-1];
    //              j--;
    //         }
    //         arr[j]= temp;
    //         c++;
    //     }
    // }




    
}