package Unit1;

/**
 * This class will be used to test the BankAccount Class
 */

public class ClientBankAccount
{
    public static void main()
    {
        // when you use the word new , this indicates that you will
        //  be constructing a new object
        //To construct a new object, 
        //  you must call the constructor from the class
        BankAccount ba1 = new BankAccount("Ann");
        
        System.out.println(ba1);
        
        BankAccount ba2 = new BankAccount ("Bob", 1047.58);
        System.out.println(ba2);
        
        // accessor methods always return something
        // so we need to do something with that 
        String name = ba1.getName();
        System.out.println("name ="+ name);
        double money = ba1.checkBalance();
        System.out.println("money ="+ ba2.checkBalance());
        
        BankAccount ba3 = new BankAccount(ba1.getName(), ba2.checkBalance());
        System.out.println(ba3);
        
        ba1.deposit(1000);
        System.out.println(ba1);
        
        double b = ba1.deposit(500);
        System.out.println("b ="+ b);
        System.out.println(ba1);
        
        ba1.deposit(1000);
        System.out.println(ba1);
        
        
        // withdraw method
        ba1.withdraw( 1000 );
        System.out.println( ba1 );
        ba1.withdraw( 800 );
        System.out.println( ba1 );
        
        // transfer method
        BankAccount ba4 = new BankAccount("Mack" , 1000 );
        BankAccount ba5 = new BankAccount("Kal-El" , 1500 );
        System.out.println( "Transfer" );
        System.out.println( ba4 );
        System.out.println( ba5 );
        // taking 250 from ba4, put into ba5
        ba4.transfer(ba5 , 250 ) ;  
        System.out.println( ba4 );
        System.out.println( ba5 );
        
    }
}
