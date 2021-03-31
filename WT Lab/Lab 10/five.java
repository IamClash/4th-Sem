import java.util.*;
class five
{
   static void checkTime(int h,int m, int s) throws HrsException,MinException,SecException
   {
        if(h>24 || h<0)
            throw new HrsException("Invalid input for hour");
        else if(m>60 || m<0)
            throw new MinException("Invalid input for minute");
        else if(s>60 || s<0)
            throw new SecException("Invalid input for seconds");
        else
            System.out.println("Correct Time -> "+h+" : "+m+" : "+s);
   }
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours : ");
        int h=sc.nextInt();
        System.out.print("Enter minutes : ");
        int m=sc.nextInt();
        System.out.print("Enter seconds : ");
        int s=sc.nextInt();
        try
        {
            checkTime(h,m,s);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
   }
}
class SecException extends Exception
{
    SecException(String s)
    {
        super(s);
    }
}
class MinException extends Exception
{
    MinException(String s)
    {
        super(s);
    }
}
class HrsException extends Exception
{
    HrsException(String s)
    {
        super(s);
    }
}