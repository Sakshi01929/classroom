import java.util.Scanner;

public class Amstrongnumber {

    /**
     * @param number
     */
    static void numberCheck(int number)
    {
        int sum=0,r;
        int temp=number;
        while(temp>0)
        {
         r=temp%10;
         temp=temp/10;
          sum=sum+r*r*r;
        }

        if(number==sum)
        {
            System.out.println("Number is Amstromg number:" +sum);
        }
    }
   public static void main(String [] args)
   {
    System.out.println("Enter the number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
      numberCheck(number);
   } 
}
