class test3
{
    public static float Marks(int p,int c,int m,int o){
        int total=p+c+m+o;
        float perc=total/280.0f*100;
        return perc;
    }
    public static void main(String[] args) {
        float res=Marks(45, 67, 56, 43);
        System.out.println(res);
    }
}