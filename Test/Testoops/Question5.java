import java.util.Scanner;
class Question5{
    static int random=100001;
    int id;
    int model_no;
    int year;
    String name;
    String model;
    double price;

    
    public Question5(int model_no, int year, String name, String model, double price) {
        id=random++;
        this.model_no = model_no;
        this.year = year;
        this.name = name;
        this.model = model;
        this.price = price;
    }
    void details(){
        System.out.println("\nProduct ID = LAP101"+year+id);
        System.out.println("Brand: "+name);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price );
    }
}
class Mainclass5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter model no: ");
        int modelno=sc.nextInt();
        System.out.print("Enter Year of manufacture: ");
        int yom=sc.nextInt();
        System.out.print("Enter Brand name: ");
        String name=sc.next();
        System.out.print("Enter model: ");
        String model=sc.next();
        System.out.print("Enter Price: ");
        double price=sc.nextDouble();
        Question5 lap1=new Question5(modelno, yom, name, model, price);
        lap1.details();
        System.out.println("========================================");
        System.out.print("Enter model no: ");
        int modelno1=sc.nextInt();
        System.out.print("Enter Year of manufacture: ");
        int yom1=sc.nextInt();
        System.out.print("Enter Brand name: ");
        String name1=sc.next();
        System.out.print("Enter model: ");
        String model1=sc.next();
        System.out.print("Enter Price: ");
        double price1=sc.nextDouble();
        Question5 lap2=new Question5(modelno1, yom1, name1, model1, price1);
        lap2.details();

    }
}
