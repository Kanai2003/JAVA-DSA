import java.util.*;

public class BitManipulations{
        public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value : ");
        int n = sc.nextInt();
        System.out.println("Enter position : ");
        int position = sc.nextInt();
        int bitMask = 1<<position;


        //get bit(it will find a bit is 0/1) operation(AND operation)---------
        // if ((bitMask & n)==0){
        //     System.out.println(position +" positional bit is 0");
        // }else{
        //     System.out.println(position+" positional bit is 1");
        // }


        //set bit(it will change 0 -> 1) operation(OR operation)----------
        // int newNumber = bitMask | n;
        // System.out.println("set bit operational value is : " + newNumber);


        //clear bit(it will clear any bit that means change 1 -> 0) operation(AND with NOT operation)----------
        // int notBitMusk = ~(bitMask);
        // int newNumber = notBitMusk & n;
        // System.out.println("clear bit operational value is : "+newNumber);


        //Update bit(it will update any bit to 0/1)operation(for 0 ->AND with NOT operation)(for 1 ->OR operation)-----------
        // System.out.println("Enter operation(0/1) to Update it to 0/1 : ");
        // int operation = sc.nextInt();
        // if (operation == 1 ){
        //     int newNumber = bitMask | n;
        //     System.out.println("Update bit operational value is : "+ newNumber);
        // }else{
        //     int notBitMusk = ~(bitMask);
        //     int newNumber = notBitMusk & n;
        //     System.out.println("Update bit operational value is : "+newNumber);
        // }


        



    }
}