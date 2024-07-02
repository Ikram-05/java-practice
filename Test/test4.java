class test4
{
    public static float Shopping(int p1,int p2,int p3,int p4)
    {
        float total=p1+p2+p3+p4;
        float dis=total*25.4f/100;
        float price=total-dis;
        return price;
    }
    public static void main(String[] args) {
        float res=Shopping(1000,500,2000,500);
        System.out.println("The total bill is "+res);
        
    }
}