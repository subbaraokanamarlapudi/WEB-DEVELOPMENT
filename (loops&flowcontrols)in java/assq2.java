import java.util.*;
public class assq2 {
    // write a program to print sum of odds and evens enter by user
    public static void main(String args[])
    { int n;
        Scanner sc= new Scanner(System.in);
        int evensum=0;
        int oddsum=0;
        do{
            System.out.print("enter  an INTEGER");
        int n1= sc.nextInt();
        if(n1==0)
        {break;}
        if(n1%2==0)
        {
            evensum = n1+evensum;
        }
        else{
            oddsum=n1+oddsum;
        }
        }
     while(true);
 System.out.println("evensum = " + evensum);
 System.out.println("oddsum = " + oddsum);
        
        
    }
    
}
