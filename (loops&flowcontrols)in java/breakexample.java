// program to get keep entering until user gives multiple of 10
import java.util.*;
public class breakexample {
    public static void main(String args[])
    {
         Scanner sc= new Scanner(System.in);
        do{
            System.out.println("enter a value ");
            int n= sc.nextInt();
            if(n % 10 ==0)
            {
                break;
            }
        }
        while(true);

         

    }
    
}
