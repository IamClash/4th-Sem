import java.util.*;
class one
{
    void f()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter number at index "+i+" : ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter index to check : ");
        int ind=sc.nextInt();
        try
        {
            System.out.println(a[ind]+" found at index "+ind);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}