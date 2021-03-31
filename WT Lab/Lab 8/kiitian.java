import java.util.*;
class kiitian extends student
{
    kiitian(int roll,int regno)
    {
        this.roll=roll;
        this.regno=regno;
    }
    void course()
    {
        System.out.println("\nRoll No = " + roll+"\nRegistratrion Number = "+regno);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll : ");
        int roll=sc.nextInt();
        System.out.print("Enter regno : ");
        int regno=sc.nextInt();
        student obj=new kiitian(roll,regno);
        obj.course();
    }
} 
abstract class student
{
    int roll,regno;
    abstract void course();
}