import java.util.*;
class seven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bank obj = new Bank();
        System.out.println("1. Deposit\n2. Withdraw\n3. Show\n4. Exit");
        try
        {
            while(true)
            {
                System.out.print("Enter your choice : ");
                int ch=sc.nextInt(),amt;
                switch(ch)
                {
                    case 1:
                    System.out.print("Enter amount to deposit : ");
                    amt = sc.nextInt();
                    obj.deposit(amt);
                    break;
                    case 2:
                    System.out.print("Enter amount to withdraw : ");
                    amt = sc.nextInt();
                    obj.withdraw(amt);
                    break;
                    case 3:
                    System.out.println("The current balance is = "+obj.bal);
                    break;
                    case 4:
                    System.exit(0);
                    default :
                    System.out.println("Invalid operation, Please choose a valid operation");
                }
            }
        }
        catch (LessBalance e)
        {
            System.out.println(e+" Exception Occured");
        }
    }
}
class Bank
{
    final int min = 500 ;
    int bal = min ;
    int show()
    {
        return bal;
    }
    void deposit(int amt)
    {
        bal = bal + amt;
    }
    void withdraw(int amt) throws LessBalance
    {
        if ( bal - amt > min)
            bal = bal-amt;
        else
            throw new LessBalance();
    }
}
class LessBalance extends Exception
{
    LessBalance()
    {
        System.out.println("Minimum Balance should be 500");
    }
    LessBalance(String s)
    {
        super(s);
    }
}