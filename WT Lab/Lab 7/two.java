import java.util.*;
class two
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the plate : ");
        int l=sc.nextInt();
        System.out.print("Enter width of the plate : ");
        int w=sc.nextInt();
        System.out.print("Enter height of the box : ");
        int h=sc.nextInt();
        System.out.print("Enter thickness of the wood box : ");
        int t=sc.nextInt();
        wb obj = new wb(l,w,h,t);
        System.out.println("\nVolume = "+obj.vol());
    }
}
class plate
{
    int length,width;
    plate(int l,int w)
    {
        length=l;
        width=w;
    }
}
class box extends plate
{
    int height;
    box(int l, int w, int h)
    {
        super(l,w);
        height=h;
    }
}
class wb extends box
{
    int thick;
    wb(int l,int w,int h,int t)
    {
        super(l,w,h);
        thick=t;
    }
    int vol()
    {
        return length*width*height*thick;
    }
}