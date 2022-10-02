import java.util.*;
//  print numbers from 1 to n
public class numbersfrom1ton {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number" );
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(i + " ");
            i=i+1;
        }
        
    }
    
}
