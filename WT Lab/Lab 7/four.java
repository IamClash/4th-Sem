import java.util.*;
class four
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        int r=sc.nextInt();
        circle cir = new circle(r);
        cir.calc();
        cir.showarea();
        System.out.print("Enter length of rectangle : ");
        int l=sc.nextInt();
        System.out.print("Enter breadth of rectangle : ");
        int b=sc.nextInt();
        rectangle rect = new rectangle(l,b);
        rect.calc();
        rect.showarea();
    }
}
class shape
{
    float area;
    void showarea()
    {
        System.out.println("The area is = "+area+"\n");
    }
}
class circle extends shape
{
    int radius;
    circle(int r)
    {
        radius=r;
    }
    void calc()
    {
        area=(22/7.0f)*radius*radius;
    }
}
class rectangle extends shape
{
    int length,breadth;
    rectangle(int l, int b)
    {
        length=l;
        breadth=b;
    }
    void calc()
    {
        area = length*breadth;
    }
}