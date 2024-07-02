import java.util.Scanner;
class Program7{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int prd=1;
        int digit=num%10;
        while(num!=0){
            sum=sum+digit;
            prd=prd*digit;
            num=num/10;
            digit=num%10;
        }
        System.out.println("The sum of digit : "+sum);
        System.out.println("The Prouct of digit: "+prd);

    }
}