import java.util.*;
class four
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check : ");
        int n=sc.nextInt(),t=n,s=0,r;
        while(t!=0)
        {
            r=t%10;
            s=(s*10)+r;
            t=t/10;
        }
        if (n==s)
            System.out.println(n+" is a palindrome number");
        else
            System.out.println(n+" is not a palindrome number");
    }
}