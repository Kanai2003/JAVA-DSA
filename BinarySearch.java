public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9,11,13,15,17,19};
        int target = 15;
        int ans = BS(arr, target);
        System.out.println("Your ans is : " + ans);
        
    }

    public static int BS(int [] arr , int target){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end - start)/2;    
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid] ){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}