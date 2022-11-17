// package JAVA-DSA.BasicConcepts&Questions;

public class ForLoop {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
}
