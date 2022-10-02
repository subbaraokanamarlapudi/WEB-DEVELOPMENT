public class reverseofnmbr {
    //reverse of number
    public static void main(String args[])
    {
        int nbr=12345;
        int rev=0;

        // while(nbr>0){
        //     int lastdigit= nbr%10;// to get lastdigit
        //     System.out.print(lastdigit);
        //     nbr=nbr/10;}// to update number without lastdigit
        
        while(nbr>0){
            int ldigit=nbr%10;
            rev=(rev*10)+ldigit;
            nbr=nbr/10;
        }
        System.out.println(rev);
        
        
    }
    
}
