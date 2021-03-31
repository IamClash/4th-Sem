import java.util.*;
class five
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of students : ");
        int n = Integer.parseInt(sc.nextLine());
        int[] roll = new int[n];
        String[] name = new String[n];
        float[] cgpa = new float[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("\nEnter roll of student "+(i+1)+" : ");
            roll[i]=Integer.parseInt(sc.nextLine());
            System.out.print("Enter name of student "+(i+1)+" : ");
            name[i]=sc.nextLine();
            System.out.print("Enter CGPA of student "+(i+1)+" : ");
            cgpa[i]=Float.parseFloat(sc.nextLine());
        }
        int ind=0;
        float min=cgpa[ind];
        System.out.println("\nDisplaying details of studets :-\nRoll\tName\tCGPA");
        for(int i=0;i<n;i++)
        {
            System.out.println(roll[i]+"\t"+name[i]+"\t"+cgpa[i]);
            if (cgpa[i] <= min)
            {
                min=cgpa[i];
                ind=i;
            }
        }
        System.out.print("\n"+name[ind]+" has the lowest CGPA of "+cgpa[ind]);
    }
}