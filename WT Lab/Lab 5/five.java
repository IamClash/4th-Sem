import java.util.*;
class five
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter number "+(i+1)+" : ");
            a[i]=sc.nextInt();
        }
        boolean vis[] = new boolean[n];
        Arrays.fill(vis, false);
        for(int i=0;i<n;i++)
        {
            if (vis[i] == true)
                continue;
            int c =1;
            for (int j=i+1;j<n;j++)
            {
                if (a[i]==a[j])
                {
                    vis[j]=true;
                    c++;
                }
            }
            System.out.println(a[i] + " occurs "+c+" times");
        }
    }
}