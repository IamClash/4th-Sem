class six
{
    public static void main(String[] args) 
    {
        try
        {
            if (args.length < 4)
                throw new CheckArgs("Arguments less than 4");
            else
            {
                int sum =0;
                for ( int i =0 ; i< args.length; i++)
                    sum = sum + (Integer.parseInt(args[i])*Integer.parseInt(args[i]));
                System.out.println("Sum of squares of arguments = "+sum);
            } 
        }
        catch (CheckArgs a)
        {
            System.out.println(a);
        }
    }
}
class CheckArgs extends Exception
{
    public CheckArgs(String s)
    {
        System.out.println(s);
    }
}