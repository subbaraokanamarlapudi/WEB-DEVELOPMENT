import java.util.*;
// write a program to print multiplication table
public class assq4 {
    public static void main(String args[])

    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number buddy :");
        int n= sc.nextInt();
        System.out.println(" multiplication table of" + n );
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + "*"+ i + " = " +n*i);
        }
    }
    
}
