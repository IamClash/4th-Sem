import java.util.*;
class five
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Person[] obj=new Person[5];
        for(int i=0;i<=4;i++)
        {
            System.out.print("Enter name of Person "+(i+1)+" : ");
            String name = sc.nextLine();
            System.out.print("Enter aadhar number of Person "+(i+1)+" : ");
            int adhno=Integer.parseInt(sc.nextLine());
            System.out.print("Enter account number of Person "+(i+1)+" : ");
            int accno=Integer.parseInt(sc.nextLine());
            System.out.print("Enter balance of Person "+(i+1)+" : ");
            float balance= Float.parseFloat(sc.nextLine());
            System.out.println();
            obj[i]=new Person(name,adhno,accno,balance);
        }
        System.out.println("\nName\t\tAadhar Number\t\tAccount Number\t\tBalance\n");
        for(int i=0;i<=4;i++)
            obj[i].disp();
    }
}
class Account 
{
    int accno;
    float balance;
    Account(int accno,float balance)
    {
        this.accno = accno;
        this.balance = balance;
    }
    void disp()
    {
        System.out.print(accno+"\t\t\t"+balance+"\n");
    }
}
class Person extends Account
{
    int adhno;
    String name;
    Person(String name,int adhno,int accno,float balance)
    {
        super(accno,balance);
        this.name=name;
        this.adhno=adhno;
    }
    void disp()
    {
        System.out.print(name+"\t\t"+adhno+"\t\t\t");
        super.disp();
    }
}