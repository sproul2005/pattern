public class pattern_MUNU {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0||j==(n-1)||i==j&&i<4||i+j==(n-1)&&i<4)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for(int j=0;j<n;j++)
            {
                if(j==0&&i<(n-1)||i==(n-1)&&j>0&&j<(n-1)||j==(n-1)&&i<(n-1))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for(int j=0;j<n;j++)
            {
                if(j==0||j==(n-1)||i==j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
       System.out.print("    ");
       for(int j=0;j<n;j++)
       {
        if(j==0&&i<(n-1)||i==(n-1)&&j>0&&j<(n-1)||j==(n-1)&&i<(n-1))
        {
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
       }
            System.out.println();
        }
        
    }

}
