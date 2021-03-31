import java.util.*;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter length of 2D sheet : ");
        int l=sc.nextInt();
        System.out.print("Enter breadth of 2D sheet : ");
        int b=sc.nextInt();
        System.out.print("Enter height of 3D box : ");
        int h=sc.nextInt();
        DDD obj = new DDD(l,b,h);
        System.out.println("\nCost of 2D sheet = "+obj.cost2D());
        System.out.println("Cost of 3D box = "+obj.cost3D());
        System.out.println("\nTotal cost = "+(obj.cost2D()+obj.cost3D()));
    }
}
class DD
{
    int length,breadth;
    DD(int l,int b)
    {
        length=l;
        breadth=b;
    }
    int cost2D()
    {
        return 40*length*breadth;
    }
}
class DDD extends DD
{
    int height;
    DDD(int l,int b,int h)
    {
        super(l,b);
        height = h;
    }
    int cost3D()
    {
        return 60*length*breadth*height;
    }
}