public class pattern3 {

    static void pattern(int n)
    {
        for(int rows=1;rows<=n;++rows)
        {
            for(int col=1;col<=n+1-rows;++col)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
   public static void main(String[] args) {
       pattern(5);
         
   } 
}
