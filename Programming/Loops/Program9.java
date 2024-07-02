import java.util.Scanner;
class Program9{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num_or=num;
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        int m=count;
        num=num_or;
        int sum=0;
        while(num!=0){
            int d=num%10;
            int power=1;
            for(int i=1;i<=m;i++){
                power=power*d;
            }
            sum=sum+power;
            num/=10;
        }
        
        if(sum==num_or){
            System.out.println("It is special "+sum);
        }
        else{
            System.out.println("It is not special"+sum);
        }
    }
}