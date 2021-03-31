import java.util.*;
class four
{
    static void input(int n) throws NegativeNum
    {
        if(n<0)
            throw new NegativeNum(n+" is a negative number so exception thrown");
        else
            System.out.println((double)n+" is not a negative number so no exception thrown");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        try
        {
            input(a);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class NegativeNum extends Exception
{
    NegativeNum(String s)
    {
        super(s);
    }
}