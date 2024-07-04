import java.util.Scanner;
public class PrimeCount {
    static boolean is_prime(int n){
        int count=2;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        return count==2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int min=sc.nextInt();
        System.out.print("Enter the Higher bound: ");
        int max=sc.nextInt();
        int count=0;
        for(int i=min;i<=max;i++){
            if(is_prime(i)){
                count++;
            }
        }
        System.out.println("Prime number btween the range "+count);
    }    
}
