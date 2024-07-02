import java.util.Scanner;
class evennum{
    static void even(int n,int m){
        if(n<=m){
            if(n%2==0){
                System.out.println(n);
            }
            even(++n,m);

        }
            

    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        even(n,m);
    }
}