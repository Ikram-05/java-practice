import java.util.Scanner;
class test1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee name : ");
        String empname=sc.next();
        System.out.print("Enter employee ID : ");
        int empid=sc.nextInt();
        System.out.print("Enter employee Salary : ");
        double empsalary=sc.nextDouble();
        System.out.print("Enter employee Grade : ");
        char empgrade=sc.next().charAt(0);
        System.out.println("\nEmployee Name : "+empname);
        System.out.println("Employee ID : "+empid);
        System.out.println("Employee Salary : "+empsalary);
        System.out.println("Employee Grade : "+empgrade);

    }
}