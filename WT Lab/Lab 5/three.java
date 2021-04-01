import java.util.*;
class three
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt(),t;
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter number "+(i+1)+" : ");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if (a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("Array in sorted order");
        for(int i=0;i<n;i++)
            System.out.println("Number "+(i+1)+" : "+a[i]);
    }
}