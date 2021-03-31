import java.util.*;
class three
{
    void f()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=sc.nextInt();
        System.out.print("Enter second number : ");
        int b=sc.nextInt();
        try
        {
            System.out.println("Division of both numbers = "+(a/b));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot Divide by Zero");
        }
        finally
        {
            System.out.println("Program Ending");
        }
    }
}