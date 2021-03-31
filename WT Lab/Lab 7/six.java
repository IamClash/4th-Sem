import java.util.*;
class six
{ 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value : ");
        int v=sc.nextInt();
        derived obj = new derived(v); 
        obj.disp();
    } 
}
class base
{ 
    int value;
    base(int v)
    {
        value = v;
    }
} 
class derived extends base
{ 
    derived(int v)
    {
        super(v);
    }
    void disp()
    {
        System.out.println("The value = "+value);
    }
} 