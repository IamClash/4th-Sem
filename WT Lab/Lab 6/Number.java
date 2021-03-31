import java.util.*;
class Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter number "+(i+1)+" : ");
            a[i]=sc.nextInt();
        }
        int minind=0,maxind=0,min=a[minind],max=a[maxind],temp;
        System.out.println("Array before swapping the largest and the smallest element");
        for(int i=0;i<n;i++)
        {
            System.out.println("Number "+(i+1)+" = "+a[i]);
            if (a[i]>max)
            {
                max=a[i];
                maxind=i;
            }
            if(a[i]<min)
            {
                min=a[i];
                minind=i;
            }
        }
        temp = a[maxind];
        a[maxind]=a[minind];
        a[minind]=temp;
        System.out.println("Array after swapping the largest and the smallest element");
        for(int i=0;i<n;i++)
            System.out.println("Number "+(i+1)+" = "+a[i]);
    }
}