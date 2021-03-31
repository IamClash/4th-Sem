import java.util.*;
class two
{
    int substract(int a)
    {
        return --a;
    }
    int substract(int a,int b)
    {
        return a-b;
    }
    int substract(int a,int b,int c)
    {
        return a-b-c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        two obj=new two();
        System.out.print("Enter first number : ");
        int a =sc.nextInt();
        System.out.println("Decrement of that number is : "+obj.substract(a));
        System.out.print("Enter second number : ");
        int b =sc.nextInt();
        System.out.println("Substraction of both numbers is : "+obj.substract(a,b));
        System.out.print("Enter third number : ");
        int c =sc.nextInt();
        System.out.println("Substraction of three numbers is : "+obj.substract(a,b,c));
    }
}