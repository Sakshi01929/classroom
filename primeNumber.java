import java.util.Scanner;

public class primeNumber {

    
    
    static void primeCheck()
    {
       int temp=5;
        int count=0;
       
           for(int i=1;i<=temp;i++)
           {
                if(temp%i==0)
                {
                   count++;
                }
                
           }  
           
        
        if(count==2)
                {
                 System.out.println("number is prime number");
                }
       
         else
         {
           System.out.println("number is not prime number");
        }

    }
   public static void main( String [] args)
   {
    //  System.out.println("Enter the number");
    //  Scanner sc=new Scanner(System.in);
    //  int number=sc.nextInt();
     primeCheck();
   } 
}
