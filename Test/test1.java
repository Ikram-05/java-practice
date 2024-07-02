class test1
{
    public static String Name(String name)
    {
        return name;
    }
    public static int Age(int age)
    {
        return age;
    }
    public static void main(String[] args) {
        String res=Name("Ikram ");
        int x=Age(18);
        System.out.println(res+x);
    }
}