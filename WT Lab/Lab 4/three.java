import java.util.*;
class three
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter day number : ");
        int day=sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("It's a Monday");
                break;
            case 2:
                System.out.println("It's a Tuesday");
                break;
            case 3:
                System.out.println("It's a Wednesday");
                break;
            case 4:
                System.out.println("It's a Thursday");
                break;
            case 5:
                System.out.println("It's a Friday");
                break;
            case 6:
                System.out.println("It's a Saturday");
                break;
            case 7:
                System.out.println("It's a Sunday");
                break;
            default:
                System.out.println("Not a week day");
                break;
        }
    }
}