import java.util.*;
public class Strings{
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int count=0;
        char ch=line.charAt(count) ;
        for(int i = 0; i <line.length();i++){
            char tempCh = line.charAt(i);
            int tempCount = 1;
            for(int j = i+1 ; j<line.length();j++){
                if(tempCh == line.charAt(j)){
                    tempCount++;
                }
            }
            if(tempCount>=count && ch>=tempCh){
                ch = tempCh;
                count = tempCount;
            }
        }
        return ch;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(getMaxOccuringChar("testsample"));




        // String FirstName = "Kanailal";
        // String LastName = "Manna";
        // System.out.println(FirstName + LastName );
        // System.out.println(FirstName.length());
        // System.out.println(LastName.length());
        // for (int i = 0; i<FirstName.length();i++){
        //     System.out.println(FirstName.charAt(i));
            
        // }
        // for (int i = 0; i<LastName.length();i++){
        //     System.out.println(LastName.charAt(i));
            
        // }
       
        // if(FirstName.compareTo(LastName) == 0){
        //     System.out.println("equal");
        // }else{
        //     System.out.println("not equal");
        // }


        // int a = 5;
        // String b = "Kanailal" ;
        // System.out.println(a + b);

        
        // String fullName = FirstName + " "+ LastName;
        // String name = fullName.substring(0,2);
        // System.out.println(name);


        //String Builder---------------------------
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // // System.out.println(sb.charAt(0));

        // sb.setCharAt(0, 's');
        // System.out.println(sb);


        // sb.insert(2, 'n');
        // System.out.println(sb);


        // sb.delete(2,3);
        // System.out.println(sb);



        // StringBuilder sb = new StringBuilder("H");
        // System.out.println(sb);
        // sb.append("e");
        // System.out.println(sb);
        // sb.append("l");
        // System.out.println(sb);
        // sb.append("l");
        // System.out.println(sb);
        // sb.append("o");
        // System.out.println(sb);
        // System.out.println(sb.length());


        //reverse string
        // String str = sc.nextLine();
        // StringBuilder sb = new StringBuilder(str);
        // for(int i = 0; i<sb.length()/2;i++){
        //     int front = i;
        //     int back = sb.length()-1-i;

        //     char frontChar = sb.charAt(front);
        //     char backChar = sb.charAt(back);

        //     sb.setCharAt(front, backChar);
        //     sb.setCharAt(back, frontChar);
        // }
        // System.out.println(sb);


    }
}