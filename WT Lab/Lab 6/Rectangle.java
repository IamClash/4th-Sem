import java.util.*;
class Rectangle
{
    int length,breadth;
    Rectangle(int l,int b)
    {
        length = l;
        breadth = b;
    }
    int peri()
    {
    return 2*(length+breadth);
    }
    int area()
    {
    return length*breadth;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter length : ");
        int l=sc.nextInt();
        System.out.print("Enter breadth : ");
        int b=sc.nextInt();
        Rectangle obj= new Rectangle(l,b); 
        System.out.println("Perimeter = "+obj.peri());
        System.out.println("Area = "+obj.area());
    }
}