// package Recursion;
public class NumOfSteptoZero {
   
    public static int  res(int num , int count){                  
        if(num == 0){
            return count;
        }
        if (num %2 == 0){
            return res(num/2,count +1);
        }else return res(num-1, count+1);    
    }

    public static void main(String[] args) {
        System.out.println(res(15, 0));
    }
   
}
