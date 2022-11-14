package Unit1;
public class TimeDepositAccount
{
    //Chapter 3 notes #15
    private double iRate;
    private double balance;
    public TimeDepositAccount(double i, double b )
    {
        iRate = i;
        balance = b;
    }
    public void addInterst()
    {
        balance+=iRate*balance;
    }
    public double getBalance()
    {
        return balance;
        
    }
    public double withdraw()
    {
        double b = balance;
        balance = 0;
        return b;
    }

}