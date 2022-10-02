import java.util.*;
// prime number or not
public class primeornot {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();

    
     boolean prime=true;
     for(int i=2;i<=n-1;i++)
      {
       
       if(n % i==0)
       {
         prime=false;
       }
       
     } 
if(prime==true)
    {
        System.out.println("prime");
    }
 else{
        System.out.println("not prime");
    }
    
     
     
    }


    
    
}
