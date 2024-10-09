public class pattern2 {
    
    static void pattn(int n){
        for(int rows=1;rows<=n;++rows)
        {
            for(int col=1;col<=n;++col)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String [] args)
    {
       pattn(5);
    }
}
