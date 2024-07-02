import java.util.Scanner;
class Program6 {
    static boolean same(int num){
        int sum=0;
        int prd=1;
        int digit=num%10;
        while(num!=0){
            sum=sum+digit;
            prd=prd*digit;
            num=num/10;
            digit=num%10;
        }
        return(sum==prd);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean res=same(num);
        System.out.println(res);
    }
}
