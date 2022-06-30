package Recursion;

import java.util.*;

public class PracticeProblem {

    /*1.print all uper case of a string--------------------------------------------*/
    // public static void uperCase(String str , int idx){
    //     if(idx < 0){
    //         return;
    //     }
    //     else if(str.charAt(idx) >= 65 && str.charAt(idx) <= 90){
    //         System.out.println(str.charAt(idx));
    //     }  
    //     uperCase(str, idx-1);   
    // }

    /*2.find fibonachi by its index number----------------------------------------*/
    // public static int fibonachi(int n ){
    //     if(n<2){
    //         return n;
    //     }
    //     return fibonachi(n-1)+fibonachi(n-2);
    // }

    /*3.reverse String------------------------------------------------------------- */
    // public static void reverseString(String str ,int idx , String newStr){
    //     if(idx < 0){
    //         System.out.println(newStr);
    //         return;    
    //     }
    //     char currChar = str.charAt(idx);
    //     reverseString(str, idx-1, newStr + currChar);
    // }
        
    /*4.reverse character array--------------------------------------------------- */
    // public static void revArr(char chr[], int idx,int a){
    //     if(a>=idx){
    //         System.out.println(chr);
    //         return;
    //     }

    //     char temp =chr[a];
    //     chr[a]=chr[idx];
    //     chr[idx]=temp;
    //     revArr(chr, idx-1, a+1);
    // }

    /*5.print upto N number-------------------------------------------------------*/
    // public static void printNM(int N,int a){
    //     if(N < 0){
    //         return;
    //     }
    //     System.out.print(a+" ");
    //     printNM(N-1, a+1);
    // }

    /*6. bouble sort using recursion----------------------------------------------*/
    // public static void boubleSort(int Arr[],int n){
    //     if(n == 0){
    //          System.out.println(Arrays.toString(Arr));
    //         return;
    //     }
    //     for(int i = 0; i < n ; i++){
    //         if(Arr[i]>Arr[i+1]){
    //             int temp = Arr[i+1];
    //             Arr[i+1] = Arr[i];
    //             Arr[i]=temp;
    //         }
    //         System.out.println(Arrays.toString(Arr));
           
    //     }
    //     boubleSort(Arr, n-1);
    // }

    /*7.Sum of digit of number ----------------------------------------- */
    // public static void sumOfNum(int num , int res){
    //     if(num == 0){
    //         System.out.println(res);
    //         return;
    //     }
           
    //     sumOfNum(num/10  , res+(num%10));
    // }

    /*8.product of two number using recursion----------------------------------- */
    // public static int productOfTwoNum(int x , int y){
    //     return (x*y);
    // }

    /*9.check prime or not using recursion------------------------------- */
    // public static void primeOrNot(int num  , int count){
    //    if(count == num/2){
    //        System.out.println("It is a prime number :)");
    //        return;
    //    }
    //     if(num <= 2){
    //         System.out.println("Please re-Enter a integer value of more than 2 :(");
    //         return;
    //     }else if(num % count == 0){
    //         System.out.println("It is not a prime number :( ");
    //         return;
    //     }
    //     primeOrNot(num, count+1);
    // }

    /*10.sum of N natural number using recursion--------------------------------------- */
    // public static int sumOfNNum(int num ,int idx , int result){
    //     if(idx > num){    
    //         return result;
    //     }
    //     return sumOfNNum(num, idx+1, result += idx);
    // }

    /**11.calculate power of two --------------------------------------------------- */
    // public static int powOfTwo(int pow , int res){
    //     if(pow == 0){
    //         return res;
    //     }
    //     return powOfTwo(pow-1, res *= 2);
    // }

    // /**12.calculate factorial of a number------------------------- */
    public static int facNum(int num , int res){
        if(num == 0){
            return res;
        }
        return facNum(num-1, res *= num);
    }

    // /**13. combination sum ----------------------------------------- */
    // public static void comSum(int[] arr, int target){

       
    // }

    
    public static void main(String[] args) {   
        
            
        

        /**12.calculate factorial of a number--------------------- */
        System.out.println(facNum(5, 1 ));

        /**11.calculate power of two ------------------------- */
        //  System.out.println(powOfTwo(5, 1));
        
        /**10.sun upto N th natural number--------------------- */
        // System.out.println(sumOfNNum(10, 0, 0));

        /**9.check prime or not ------------------ */
        // primeOrNot(13, 2);

        /**8.product of two number -------------------*/
        // System.out.println(productOfTwoNum(5, 5));
    
        /**7. sum of digits of a number------------------ */
        // int num = 18452;
        // sumOfNum(num,0);

        /**6. boubble sort using recursion--------------- */
        // int[] Arr = {6,2,9,8,3};
        // boubleSort(Arr, Arr.length-1);

        /**5. print upto n natural number---------------- */
        // printNM(10, 0);
        
        /**4.reverse Array------------------- */
        // char[] chr = {'k','a','n','a','i'};
        // int idx = chr.length - 1;
        // revArr(chr, idx,0);

        /**3.rever String---------------- */
        // String str = "KanailalManna";
        // int idx = str.length()-1;
        // reverseString(str, idx,"");

         /**2.find fibonachi--------------------- */
        // int res =fibonachi(5);
        // System.out.println(res);

        /**1. uper csae---------------------------- */
        //    String str = "kanialalManna";
        //    int idx = str.length() - 1;
        //    uperCase(str, idx);


    }  
}
