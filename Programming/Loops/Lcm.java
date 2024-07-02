import java.util.Scanner;
class Lcm{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int l =num1>num2?num1:num2;
        if(l%num1==0 && l%num2==0){
            System.out.println(l);
            break ;
        }
        l++; 
    }
}