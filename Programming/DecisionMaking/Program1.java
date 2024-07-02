/*Largest of two number */
import java.util.Scanner;
class Program1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //step 1 -Create a 2 integer variable
        int num1,num2;
        //step 2-read the data using Scanner
        num1=sc.nextInt();
        num2=sc.nextInt();
        //step 3 logic to find largest
        if(num1 > num2)
        {
            System.out.println("The largest number is: "+num1);
        }
        else{
            System.out.println("The largest number is: "+num2);
        }

    }

}