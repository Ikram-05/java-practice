import java.util.Scanner;
class Program6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double min_temp=70;
        double max_temp=80;
        double temp=sc.nextDouble();
        double fahren=temp*(9f/5)+32;
        System.out.println(fahren);
        if(fahren>=min_temp && fahren<=max_temp){
            System.out.println("The range is between");
        }
    }
}
