//Program to print the pattern of
// * 
// * *
// * * * 
// * * * * 
// * * * 
// * * 
// *

import java.util.Scanner;

public class PatternType34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid=n/2+1;
        for(int i=1;i<=mid;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int j=mid-1;j>=1;j--){
            for(int k=1;k<=j;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
