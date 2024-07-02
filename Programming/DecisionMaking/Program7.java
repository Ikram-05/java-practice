//Switch case
import java.util.Scanner;
class Program7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1%2==0){
            count++;
        }
        if(num2%2==0){
            count++;
        }
        if(num3%2==0){
            count++;
        }
        switch(count){
            case 1:{
                if(num1%2==0){
                    System.out.println(num1);
                }
                else if(num2%2==0){
                    System.out.println(num2);
                }
                else{
                    System.out.println(num3);
                }
            }break;
            case 2:{
                if(num1%2==0&&num2%2==0){
                    System.out.println(num1+num2);
                }
                else if(num2%2==0&&num3%2==0){
                    System.out.println(num2+num3);
                }
                else{
                    System.out.println(num3+num1);
                }
            }break;
            case 3:{
                System.out.println(num1*num2*num3);
                break;
            }
        }
    }
    
}