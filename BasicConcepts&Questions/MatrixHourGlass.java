import java.util.*;
public class MatrixHourGlass
{
    private int[][]m;
    private int s;
    public MatrixHourGlass(int s)
    {//default constructor
        this.s=s;
        m=new int[s][s];
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+(s*s)+" elements");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
    }
    public void modify()
    {
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                if(i==j || j==s-1-i)//prints the two diagonals
                System.out.print(m[i][j]+" ");
                else if(i<s/2 && j>i && j<s-1-i || i>s/2 && j<i && j>s-1-i)//prints the elements other than the two diagonals in the rerquired places
                System.out.print(m[i][j]+" ");
                else
                System.out.print("  ");//prints space in rest of the places
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int x=sc.nextInt();
        if(x%2==0)
        {
            System.out.println("INVALID INPUT");
            return;
        }
        MatrixHourGlass ob=new MatrixHourGlass(x);
        ob.input();
        ob.modify();
    }
}