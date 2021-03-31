import java.util.*;
class Demo 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter length : ");
        int l=sc.nextInt();
        System.out.print("Enter breadth : ");
        int b=sc.nextInt();
        System.out.print("Enter height : ");
        int h=sc.nextInt();
        Box obj=new Box(l,b,h);
        System.out.println("The volume of the box is "+ obj.vol());
    }
}
class Box
{
    int length,breadth,height;
    Box(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    int vol()
    {
        return length*breadth*height;
    }
}