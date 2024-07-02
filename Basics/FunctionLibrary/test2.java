import java.util.Scanner;
class test2
{
    public static int add(int a,int b)
    {
        int res=a+b;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number ");
        int a=sc.nextInt();
        System.out.print("Enter the second number ");
        int b=sc.nextInt();
        int res=add(a, b);
        System.out.println("Addition of "+a+" and "+b+" is "+res);

    }
}