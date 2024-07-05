import java.util.Scanner;
public class SymetricPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int lenght=lenght(num);
        if(lenght%2==0){
            int n1=findN1(num, lenght);
            int n2=findN2(num, lenght);
            int add=n1+n2;
            int power=add*add;
            if(power==num){
                System.out.println("The given number is symetric power number");
            }
            else{
                System.out.println("The given number is non-symetric power number");
            }
        }
        else{
            System.out.println("Invalid input");
        }

    }

    static int reverse(int num){
        int rev=0;
        while(num!=0){
            int d=num%10;
            rev=rev*10+d;
            num/=10;
        }
        return rev;
    }

    static int findN1(int n,int l){
        for(int i=1;i<=l/2;i++){
            n/=10;
        }
        return (n);
    }

    static int findN2(int n,int l){
        int n2=0;
        for(int i=1;i<=l/2;i++){
            int d=n%10;
            n2=n2*10+d;
            n/=10;
        }
        return reverse(n2);
    }

    static int lenght(int num){
        int l=0;
        while(num!=0){
            l++;
            num/=10;
        }
        return l;
    }
}
