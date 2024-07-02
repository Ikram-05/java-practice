import java.util.Scanner;
class test3
{
    public static int square(int a){
        int area=a*a;
        return area;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side of square ");
        int a=sc.nextInt();
        int res=square(a);
        System.out.println("The Area of the Square is "+res);
    }
}