import java.util.Scanner;
class Program8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int l_digit=num%10;
        num=num/10;
        while(num!=0){
            int digit=num%10;
            if(digit>l_digit){
                l_digit=digit;
            }
            num=num/10;
        }
        System.out.println(l_digit);
    }
}
