class test5
{
    public static float Grand_total(float price,int qty)
    {
        float total=price*qty;
        float gst=total*.18f;
        float bill=total+gst;
        return bill;
    }
    public static void main(String[] args) {
        float res=Grand_total(1250.5f, 7);
        System.out.println("The total bill is "+res);
        
    }
}