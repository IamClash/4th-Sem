import java.util.*;
class three
{
    float area(float r)
    {
        return (22/7.0f)*r*r;
    }
    float area(int b,int h)
    {
        return (1/2.0f)*b*h;
    }
    float area(int a)
    {
        return a*a;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);;
        System.out.print("1. Area of circle\n2. Area of triangle\n3. Area of square\nEnter your choice : ");
        int ch=sc.nextInt();
        three obj=new three();
        switch(ch)
        {
            case 1:
            System.out.print("Enter radius of circle : ");
            float r=sc.nextFloat();
            System.out.println("Area of circle = "+obj.area(r));
            break;
            case 2:
            System.out.print("Enter base of triangle : ");
            int b=sc.nextInt();
            System.out.print("Enter height of triangle : ");
            int h=sc.nextInt();
            System.out.println("Area of triangle = "+obj.area(b,h));
            break;
            case 3:
            System.out.print("Enter side of square : ");
            int e=sc.nextInt();
            System.out.println("Area of square = "+obj.area(e));
            break;
            default:
            System.out.println("Incorrect Choice");
            break;
        }
    }
}