import java.util.Scanner;
public class Zigzag {
    static int reverse(int num){
        int rev=0;
        while(num!=0){
            int d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        return rev;
    }

    static int len(int n){
        int length=0;
        while(n!=0){
            n/=10;
            length++;
        }
        return length;
    }
    static int zigzag(int n1,int n2){
        int zigzag=0;
        while(n1!=0){
            int d=n1%10;
            zigzag=zigzag*10+d;
            n1=n1/10;
            int d2=n2%10;
            zigzag=zigzag*10+d2;
            n2=n2/10;
        }
        
        return zigzag;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers to zigzag:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        num1=reverse(num1);
        int l1=len(num1);
        int l2=len(num2);
        if(l1==l2){
            int merge=zigzag(num1, num2);
            System.out.println("The Merged number is: "+merge);
        }
        else{
            System.out.println("The Number should match same length");
        }
    }
}
