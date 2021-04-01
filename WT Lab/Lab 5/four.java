import java.util.*;
class four
{
    static int c;
    four()
    {
        c++;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count : ");
        int n = sc.nextInt();
        four obj;
        for(int i=0;i<n;i++)
            obj=new four();
        System.out.println("Object created "+c+" times");
    }
}