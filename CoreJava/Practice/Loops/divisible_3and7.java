class divisible_3and7
{
    public static void main(String[] args) {
        for(int i=0;i<=100;i++)
        {
            if(i%3==0||i%7==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}