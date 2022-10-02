import java.util.*;
// write a program to find the factorial of a number
public class assignmentq3 {
    public static void main(String args[])
    {
   Scanner sc= new Scanner(System.in);
   System.out.print("enter a number ");
   int n= sc.nextInt();
    int factorial =1;
    for(int i=1;i<=n;i++){//for(int i=n;i>0;i--)
        factorial= factorial*i;
    }
    System.out.println(" factorial = "+ factorial);

    }
    
}
