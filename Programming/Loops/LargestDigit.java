import java.util.Scanner;
public class LargestDigit {
    static int largest(int num){
        int lar=num%10;
        while(num!=0){
            int d=num%10;
            if(d>lar){
                lar=d;
                
            }
            num=num/10;
        }
        return lar;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("The largest digit in given number: "+largest(num));
    }
}
