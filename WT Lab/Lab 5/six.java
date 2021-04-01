import java.util.*;
class six
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] a= new int[3][3];
        int sumld=0,sumrd=0;
        System.out.println("Enter values in the matrix (matrix way only)");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
                if (i==j)
                    sumrd = sumrd+a[i][j];
                if (i+j==2)
                    sumld = sumld+a[i][j];
            }
        }
        System.out.println("Left Diagonal Sum = "+sumld);
        System.out.println("Right Diagonal Sum = "+sumrd);
    }
}