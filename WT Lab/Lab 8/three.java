import java.util.*;
class three
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the basic salary of the staff : ");
        int b = sc.nextInt();
        Substaff obj = new Substaff(b);
        System.out.println("The annual earning of the staff is = "+obj.earnings());
        System.out.println("The annual deductions of the staff is = "+obj.deductions());
        System.out.println("The annual bonus of the staff is = "+obj.bonus());
        System.out.println("The net annual salary of the staff is = "+(obj.earnings()+obj.bonus()-obj.deductions()));
    }
}
interface temp
{
    float earnings();
    float deductions();
    float bonus();
}
abstract class Manager implements temp
{
    int b;
    Manager(int b)
    {
        this.b=b;
    }
    public float earnings()
    {
        return (1.95f*b);
    }
    public float deductions()
    {
        return (0.12f*b);
    } 
}
class Substaff extends Manager
{
    Substaff(int b)
    {
        super(b);
    }
    public float bonus()
    {
        return (0.5f*b);
    }
}