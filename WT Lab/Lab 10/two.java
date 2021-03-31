class two
{
    public static void main(String args[])
    {
        try
        {
            int a =1/0;
        }
        catch(Exception c)
        {
            System.out.println("Complete Exception class");
            System.out.println("If we remove comments from ArithmeticException catch then compiler error occurs");
            System.out.println("There are two solutions for this problem. Doing either of them will solve this problem");
            System.out.println("1. Always catch the subclass exception before its super class exception");
            System.out.println("2. Dont write any subclass exception after writing its super class exception");
        }
        /*
        catch(ArithmeticException d)
        {
            System.out.println("Only ArithmeticException sub-class inside Exception super class");
        }
        */
    }
}