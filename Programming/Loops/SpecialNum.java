import java.util.Scanner;
public class SpecialNum {
    static int numOfDigit(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;

    }

    static int power(int n,int d){
        int power=1;
        for(int i=1;i<=n;i++){
            power*=d;
        }
        return power;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int og_num=num;
        int sum_of_num=0;
        int m=numOfDigit(num);
        while(num!=0){
            int d=num%10;
            sum_of_num=sum_of_num+power(m,d);
            num/=10;
        }
        System.out.println(sum_of_num);
        if(og_num==sum_of_num){
            System.out.println("The given number is special number");
        }
        else{
            System.out.println("The number is a not special");
        }
    }
}
