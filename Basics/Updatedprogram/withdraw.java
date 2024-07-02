class withdraw
{
    public static void main(String[] args) {
        float balance=75000;
        float amt=25000;
        System.out.println("Current blanace = "+balance);
        System.out.println("withdraw amount = "+amt);
        if(amt<=balance)
        {
            balance=balance-amt;
            System.out.println("balance after withdraw = "+balance);
        }
    }
}