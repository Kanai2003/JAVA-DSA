import java.util.*;
public class Arrays{
    public static void main(String [] args){

        // int[] marks = new int[6];
        // marks[0] = 92 ; //phy
        // marks[1] = 92 ; //chem
        // marks[2] = 88 ; //math
        // marks[3] = 86 ; //bio
        // marks[4] = 90 ; //ben
        // marks[5] = 90 ; // eng
        // int[] marks = {92,92,88,86,90,90};
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Size of Arrays :");
        // int size = sc.nextInt();
        // int[] numbers = new int[size];
        // System.out.println("Enter value of Arrays ");
       
        // for (int i = 0; i<size; i++){
        //      numbers[i] = sc.nextInt();
        // }
        // int x = sc.nextInt();
       
        // System.out.println(numbers[x]);
        // System.out.println("length of the arrays is : " + numbers.length);
        

        System.out.println("enter row size :");
        int row = sc.nextInt();
        System.out.println("Enter column size :");
        int column = sc.nextInt();
        int [][] matrix = new int[row][column];
        //row
        for (int i = 0; i < row; i++){
            //column
            for(int j = 0; j < column; j++){
                System.out.println("Enter values of Arrays for index ( " + i + " , " + j +" )");            
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter a value to fint it's index :");
        int x = sc.nextInt();
        for (int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(matrix[i][j] == x)
                System.out.println("The index of your input value is :" + "( "+ i + " , " + j + " )");
            }
        }





    }
}