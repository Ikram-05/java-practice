class medplus
{
    public static void main(String[] args){
        float sh1_cost=87;
        float sh2_cost=128;
        float sh3_cost=72;
        float syr_cost=158;
        float total=sh1_cost+sh2_cost+sh3_cost+syr_cost;
        float dis=total*0.12f;
        float bill=total-dis;
        System.out.println("Total price is "+total+"\nDiscount is "+dis+"\nThe Total amt is "+bill);
    }
}