import java.util.Scanner;
class Question2
{
    String name;
    int age;
    long ph_no;
    String proof_type;
    String pr_no;
    String pay_method;
    int bill_amt;

    Question2(String name,int age,long phno,String proof,String prno,String payment,int bill){
        this.name=name;
        this.age=age;
        ph_no=phno;
        proof_type=proof;
        pr_no=prno;
        pay_method=payment;
        bill_amt=bill;
    }
    void disp(){
        System.out.println("\nName of the customer: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone No: "+ph_no);
        System.out.println("Proof Type: "+pr_no);
        System.out.println("ID no: "+pr_no);
        System.out.println("Payment Method: "+pay_method);
        System.out.println("The total amount: "+bill_amt);

    }

}
class Mainclass2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        long ph_no=sc.nextLong();
        String proof_type=sc.next();
        String pr_no=sc.next();
        String pay_method=sc.next();
        int bill_amt=sc.nextInt();
        Question2 customer=new Question2(name, age, ph_no, proof_type, pr_no, pay_method, bill_amt);
        customer.disp();
    }
}