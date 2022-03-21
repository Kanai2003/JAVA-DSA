public class PowerOfthree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
    public static boolean isPowerOfThree(int n) {
       
        if(n<=0 ){
            return false;
        }else if (n == 1 || n ==3){
            return true;
        }else if(n >= 3){
            if (n%3 == 0){
                if(n/3 == 1){
                    return true;
                }
            }else return false;
        } 

        return isPowerOfThree(n/3);
    }
}
