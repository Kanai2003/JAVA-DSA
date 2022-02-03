import java.util.*;
public class functions {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // public static int calculateSum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }

    // public static int calculatePruduct(int a, int b ){
    //     return a*b;
    // }

    // public static void calculateFactorial(int a) {
    //     if(a<0){
    //         System.out.println("invalid input :(");
    //         return;
    //     }
    //     int factorial = 1 ;
    //     for(int i=1 ; i<=a ; i++){
    //         factorial = factorial * i;
    //         System.out.println("factorial of a number is : "+ factorial);
    //     }
    //     return;
    // }

    // public static void evenOrOdd(int a ){
    //     if( a%2 == 0){
    //         System.out.println("it is an even number");
    //     }else 
    //     System.out.println("it is a odd number");
    // }

    // public static void primeOrNot(int a) {
    //     boolean  isPrime = true;
    //     for (int i=2; i<a; i++){
    //         int  reminder = a%i;
    //         if (reminder ==0){
    //             isPrime = false;
    //         }
    //     }
    //     if (isPrime){
    //         System.out.println(a + " is a prime number ");
    //     }  else{
    //         System.out.println(a + " is not a prime number ");
    //     }
    //         return ;
        
    // }

    public static int  swap(int x , int y){
        int temp = x;
        x = y;
        y = temp;
   
        return x;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = 20;
        int b= 30;
        System.out.println(swap(a, b));


        //for printMyName function------------
        // String name = sc.next();
        // printMyName(name); //calling the printMyName function.

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        //for calculateSum function------------
        // int sum = calculateSum(a, b);
        // System.out.println("sum of two numbers is :"+ sum );

        //for calcialteProduct function--------------
        // System.out.println("Product of two numbers is : "+calculatePruduct(a, b));

        //for calculateFactorial function----------
        // calculateFactorial(a);

        //for evenOrOdd function----------
        // evenOrOdd(a);


        //for primeOrNot function------------
        // primeOrNot(a);

        
    }
    
}
