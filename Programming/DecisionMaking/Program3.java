//Finding the smallest age

import java.util.Scanner;
class Program3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age1=sc.nextInt();
        int age2=sc.nextInt();
        int age3=sc.nextInt();
        if(age1>=0 && age2>=0 && age3>=0){
            if(age1<age2 && age1<3){
                System.out.println("The smallest age is "+age1);
            }
            else if(age2<age3){
                System.out.println("The smallest age is "+age2);
            }
            else{
                System.out.println("The smallest age is "+age3);
            }
        }
        else{
            System.out.println("Invalid Age");
        }
    }
}