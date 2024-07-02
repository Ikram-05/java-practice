import java.util.Scanner;
class Question1{
    String brand_name;
    String engine_type;
    String fuel_type;
    int seating_capacity;
    String model;

    Question1(String name,String engine,String fuel,int seat,String model){
        brand_name=name;
        engine_type=engine;
        fuel_type=fuel;
        seating_capacity=seat;
        this.model=model;
    }
    void details(){
        System.out.println("\nBrand: "+brand_name);
        System.out.println("Engine type: "+engine_type);
        System.out.println("Fule type: "+fuel_type);
        System.out.println("Seating capacity: "+seating_capacity);
        System.out.println("Model: "+model);
    }
}
class Mainclass1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String type=sc.next();
        String fuel=sc.next();
        int seat=sc.nextInt();
        String model=sc.next();
        Question1 car=new Question1(name, type, fuel, seat, model);
        car.details();
        
    }
}