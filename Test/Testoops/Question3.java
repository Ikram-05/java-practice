import java.util.Scanner;
class Question3{
    String st_name;
    String degree;
    String mail;
    long ph_no;
    
    Question3(String name,String degree,long phno,String mail){
        st_name=name;
        this.degree=degree;
        ph_no=phno;
        this.mail=mail;
    }
    void disp(){
        System.out.println("Student Name: "+st_name);
        System.out.println("Degree: "+degree);
        if(ph_no>=0){
            System.out.println("Phone no: "+ph_no);
        }
        else{
            System.out.println("Mail: "+mail);
        }
    }
}
class Mainclass3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String degree=sc.next();
        long phno=sc.nextLong();
        String mail=sc.next();
        Question3 st1=new Question3(name, degree, phno, mail);
        st1.disp();
    }
}