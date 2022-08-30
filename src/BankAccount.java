/**
 * BankAccount is the class used to initialise a Bank Account
 *
 * @author Keith Patrick Scannell
 *
 */
public class BankAccount {

    // variables
    /**
     * The person that owns the bank account - composed of Person
     * */
    private Person person;
    /**
     *  The account number of the bank account
     *  this cannot be changed
    * */
    private final int accNum;
    /**
     * The balance of the bank account
    * */
    private int balance;

    @Override
    public String toString(){
        return getPerson() + ", " +getAccNum() + ", " + getBalance();
    }
    //constructor
    /**
     *  Initialises the person, account number and balance
     *
     * @param newPerson - the person who owns the bank account
     * @param newAccNum - the account number of the bank account
     * @param newBalance - the balance of the bank account
     * */
    public  BankAccount(Person newPerson, int newAccNum, int newBalance ){
        setPerson(newPerson);
        setBalance(newBalance);
        this.accNum = newAccNum;
    }


    // methods
    /**
     * Displays the person's details as well as the bank account details
     * */
    public void display(){
        System.out.println("Account holder: "+getPerson().getFirstName()+" " +getPerson().getLastName()+"\nAccount number: "+ getAccNum()+"\nBalance: " + getBalance());
    }


    // Setters and Getters
    public int getAccNum() {
        return accNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}

