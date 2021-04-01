import java.util.*;
class five
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter First Name : ");
        String fn = sc.nextLine();
        System.out.print("Enter Last Name : ");
        String ln = sc.nextLine();
        System.out.println("Formal Name = "+(ln+" "+fn));
    }
}