import java.util.*;  
class eight   
{  
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack <Integer> s = new Stack<>();
        System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
        try
        {
            while(true)
            {
                System.out.print("Enter your choice : ");
                int ch=sc.nextInt();
                switch(ch)
                {
                    case 1: 
                    System.out.print("Enter number to push : ");
                    int n = sc.nextInt();
                    push(s,n);
                    break;
                    case 2:
                    pop(s);
                    break;
                    case 3:
                    System.out.println("Stack = "+s);
                    break;
                    case 4:
                    System.exit(0);
                    default :
                    System.out.println("Invalid operation, Please choose a valid operation");
                }
            }
        }
        catch (Underflow e)
        {
            System.out.println(e+" Exception Occured"); 
        }
        catch (Overflow e)
        {
            System.out.println(e+" Exception Occured"); 
        }
    }
    static void push(Stack s,int n) throws Overflow
    {
        System.out.println("Pushing "+n+" to stack");
        s.push(new Integer(n));
    }
    static void pop(Stack s) throws Underflow
    {
        if (s.empty())
            throw new Underflow();
        else
        {
            int n= (int)s.pop();
            System.out.println("Poping "+n+" from stack");
        }
    }
}
class Overflow extends Exception
{
    Overflow()
    {
        System.out.println("Cannot push to full stack");
    }
    Overflow( String s)
    {
        super(s);
    }
}
class Underflow extends Exception
{
    Underflow()
    {
        System.out.println("Cannot pop from empty stack");
    }
    Underflow( String s)
    {
        super(s);
    }
}