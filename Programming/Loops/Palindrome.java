import java.util.Scanner;
public class Palindrome{
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=reverse(num);
        if(num==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome..!!");
        }
    }
}
