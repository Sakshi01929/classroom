public class pattern1
{
    static void pattn(int n)
    {
      for(int rows=1;rows<=n;++rows)
      {
        for(int col=1;col<=rows;++col)
        {
           System.out.print("* "); 
        }
        System.out.println(" "); 
      } 
      
    }
    public static void main(String [] args)
    {
        pattn(4);
    }
}