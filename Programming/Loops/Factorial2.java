import java.util.Scanner;
class Factorial2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=1;
        int i=2;
        while(i<=n){
            result=result*i;
            i++;
        }
        System.out.println(result);
    }
}