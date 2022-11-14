package Unit1;

/**
 * This class will be used to represent a BankAccount
 * Balance
 * Interest Rate
 * Debt
 * Name
 * Password
 * 
 * 
 * Behavior:
 * deposit
 * withdraw
 * transfer
 * check balance
 * apply interest
 * freeze account
 * close account
 * open account - constructor
 */
public class BankAccount
{
    // fields - instance variables 
    // private
    private double balance;
    private String name; 
    
    //lets make two new fields. We are going to make the baank account
    //  have a unique account number. TO create a unique account
    //  number we need a static filed generate it.
    
    private int accountNumber;
    private static int accountNumberGenerator = 1000000;
    
    //constructors 
    //we define the fields (if we don't they get the default value
    //have as many constructors as you want
    //as long as they have differnt parameters
    
    public BankAccount(String n)
    {
        name = n;
        balance = 100;//constructor
        //field = parameters
        accountNumber = accountNumberGenerator;
        accountNumberGenerator++;
    }
    
    public BankAccount( String n , double b) 
    {
        name = n;
        balance = b;
        accountNumber = accountNumberGenerator;
        accountNumberGenerator++;
    }
    
    /**
     * This returns a String that represents what the class will 
     *  look like when it is printed
     * @return String   Name and Balance
     */
    public String toString()
    {
        String s1= "Bank Account";
        String s1a = "Account number = "+accountNumber;
        String s2 = "Name = "+ name;
        String s3  = "balance = " + balance;
        return s1 + "\n" + s1a + "\n" + s2 + "\n" + s3 + "\n";
        
    }
    
    //accessor methods are designed to allow access to the fields 
    public String getName()
    {
        return name;
        
    }
    public double checkBalance()
    {
        return balance;
    }
    
    /**
     * This method will increse the balance by the parameter
     * @param   double    This is the amount we will increase the
     *                    balance by 
     * @return  double      This is the new balance
     */
    public double deposit ( double deposit )
    {
        if (deposit > 0 )
            balance += deposit ;
        return balance;
    }
    
    
    /**
     * Withdraw will remove parameter from the balance and if the balance is less than zero afterwards,
     *  apply a penalty o the account
     *  @param double   this is the amount to withdraw
     *  @return double  the current balance after the withdraw
     */
    public double withdraw(double withdraw)
    {
        if(withdraw<= 0)
            return balance;
        balance -= withdraw;
        if(balance<0)
            balance -= 25;
        return balance;
    }
    
    /**
     * Transfer will move funds from this BankAccount into the
     * parameter BankAccount
     * @param   BankAccount transferTo  This is where the funds will be transfered to
     * @param   double amount       how much money will be transfered
     * @return  double  current balance of this BankAccount after transfer
     */
    public double transfer(BankAccount transferTo, double amount )
    {
        //this - refers to the object that called this method
        /*
        if ( amount <= 0)
            return this.balance;
        if ( this.balance < amount )
            return this.balance;
        this.balance -= amount;
        transferTo.balance +=amount;
        return this.balance; 
        */
       
        this.withdraw(amount);
        transferTo.deposit(amount);
        return this.balance;
    }
    
    
}
