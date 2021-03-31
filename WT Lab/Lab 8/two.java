import java.util.*;
class two
{
    public static void main(String[] args)
    {
    Washing_Machine obj = new Washing_Machine();
    System.out.print("Enter the value of interface date member capacity : ");
    System.out.println("The value of capacity is = "+obj.capacity);
    System.out.print("Enter time for which the machine has run : ");
    int t=obj.sc.nextInt();
    System.out.print("Enter units of electricity consumed by machine : ");
    int u=obj.sc.nextInt();
    obj.run(t);
    obj.consume(u);
    }
}
interface Motor
{
    Scanner sc=new Scanner(System.in);
    int capacity=sc.nextInt();
    void run(int t);
    void consume(int u);
}
class Washing_Machine implements Motor
{
    public void run(int t)
    {
        System.out.println("The machine ran for only " + t + " hours.");
    }
    public void consume(int u)
    {
        System.out.println("The machine has consumed " + u + " units of electricity.");
    }
}