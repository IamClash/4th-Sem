class one
{
    public static void main(String[] args)
    {
        if (Integer.parseInt(args[0])>=Integer.parseInt(args[1])
        && Integer.parseInt(args[0])>=Integer.parseInt(args[2]))
            System.out.println(args[0]+" is the largest number");
        else if (Integer.parseInt(args[1])>=Integer.parseInt(args[2])
        && Integer.parseInt(args[1])>=Integer.parseInt(args[0]))
            System.out.println(args[1]+" is the largest number");
        else
            System.out.println(args[2]+" is the largest number");
    }
}