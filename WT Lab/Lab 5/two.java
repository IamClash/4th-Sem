class two 
{
    public static void main(String[] args)
    {
        int c=0;
        for(int i=0;i<10;i++)
        {
            if (Integer.parseInt(args[i])%2==0)
                c++;
        }
        System.out.println("No. of even numbers = "+c);
        System.out.println("No. of odd numbers = "+(10-c));
    }
}