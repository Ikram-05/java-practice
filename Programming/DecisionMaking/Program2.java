//Smallest character ASCII

import java.util.Scanner;
class Program2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //step1-create a variable;
        char c1,c2;
        //read the value
        c1=sc.next().charAt(0);
        c2=sc.next().charAt(0);
        //step3-decsion making
        if(c1<c2){
            System.out.println("The smallest character is: "+c1);
        }
        else{
            System.out.println("The smallest character is: "+c2);
        }



    }

}