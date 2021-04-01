import java.util.*;
class two
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your marks : ");
            int mr=sc.nextInt();
            if (mr>=90)
                System.out.println("You have got an O grade");
            else if (mr>=80)
                System.out.println("You have got an E grade");
            else if (mr>=70)
                System.out.println("You have got an A grade");
            else if (mr>=60)
                System.out.println("You have got a B grade");
            else if (mr>=50)
                System.out.println("You have got a C grade");
            else if (mr>=40)
                System.out.println("You have got a D grade");
            else
                System.out.println("Sorry you have not passed the exam");
    }
}