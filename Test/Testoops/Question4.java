import java.util.Scanner;
class Question4{
    static int random=1001;
    int id;
    double price;
    String product_name;

    Question4(double price,String type){
        id=random++;
        this.price=price;
        product_name=type;
    }
    void print(){
        System.out.println("\nProduct: "+product_name);
        System.out.println("Product ID: "+id);
        System.out.println("Price: "+price);
    }
}
class Mainclass4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the price: ");
        double price=sc.nextDouble();
        System.out.print("Enter the product: ");
        String type=sc.next();
        Question4 p1=new Question4(price,type);
        p1.print();
        System.out.print("\nEnter the price: ");
        double price1=sc.nextDouble();
        System.out.print("Enter the product: ");
        String type1=sc.next();
        Question4 p2=new Question4(price1, type1);
        p2.print();
    }
}
