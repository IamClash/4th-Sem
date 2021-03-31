import java.util.*;
class two
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Change case\n2. Reverse\n3. Compare\n4. Insert\nEnter choice : ");
        int ch=Integer.parseInt(sc.nextLine());
        System.out.print("Enter a string : ");
        String s1=sc.nextLine(),s2="";
        switch(ch)
        {
            case 1:
            for(int i=0;i< s1.length();i++)
            {
                char c = s1.charAt(i);
                if (Character.isLowerCase(c))
                    s2 = s2 + Character.toUpperCase(c);
                else
                    s2 = s2 + Character.toLowerCase(c);
            }
            System.out.println("Converted Case String is = "+s2);
            break;
            case 2:
            for(int i=s1.length()-1;i>=0;i--)
                s2 = s2 + s1.charAt(i); 
            System.out.println("Reversed string is = "+s2);
            break;
            case 3:
            System.out.print("Enter second string : ");
            s2 = sc.nextLine();
            System.out.println("The difference between the ASCII value of the two strings is "+s1.compareTo(s2));
            break;
            case 4:
            System.out.print("Enter second string : ");
            s2 = sc.nextLine();
            s1 = s1.substring(0,s1.indexOf(" ")+1)+s2+s1.substring(s1.indexOf(" "));
            System.out.println("Second string inserted into the first string is = "+s1);
            break;
        }
    }
}