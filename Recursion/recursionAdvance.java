import java.util.*;
public class recursionAdvance {
    // public static void printPermutation(String str, String permutation ){
    //     if (str.length() == 0 ){
    //         System.err.println(permutation);
    //         return;
    //     }
    //     for(int i = 0 ; i<str.length(); i++){
    //         char currChar = str.charAt(i);
    //         String newString = str.substring(0, i) + str.substring(i+1);
    //         printPermutation(newString, permutation + currChar);
    //     }

    // }
    
    public static void SumOfTriangle(int ipt[] , int idx){
       if(idx == 0){
        //    System.out.println(ipt[0]);
           return ;
       }
       int[] newArr =  new int [idx];
       for(int i = 0 ; i < idx; i++){
          newArr[i]=ipt[i]+ipt[i + 1];
       
         System.out.print(newArr[i] + "  ");
        }
        System.out.println();
       SumOfTriangle(newArr, idx-1);
    }

    

    public static void main(String[] args) {
        // String str = "abc";
        // printPermutation(str,"");
        
        int ipt[] = { 1 , 2 , 3 , 4 , 5 , 6 , 7};
        int n = ipt.length - 1;
        SumOfTriangle(ipt,n);        


    }
}
