import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        int largest=num1>num2?num1:num2;
        for(int i=largest/2;i>=2;i--){
            if(num1%i==0 && num2%i==0){
                System.out.println("The HCF of the numbers "+i);
                break;
            }
        }
    }
}

