import java.util.Scanner;
public class HarmonyNum{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        boolean res=harmonious(num);
        if(res){
            System.out.println("The given number is Harmonious");
        }
        else{
            System.out.println("The given number is not harmonious");
        }

    }
    static boolean harmonious(int num){
        int f1=firstDigit(num);
        int l1=num%10;
        int sum_of_1_2=f1+l1;
        int remain=getRemaingSum(num);
        boolean res=(sum_of_1_2==remain);
        return res;

    }

    
    static int firstDigit(int num){
        while(num>=10){
            num/=10;
        }
        return num;
        
    }

    static int getRemaingSum(int num){
        int sum=0;
        num/=10;
        while(num>=10){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}