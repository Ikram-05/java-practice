import java.util.Scanner;
public class PrimeNum {

    static boolean isPrime(int num){
        int count =2;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
            }
        }
        return count ==2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        if(min<max&&min>=2){
            for(int i=min;i<=max;i++){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }    
    }
}
