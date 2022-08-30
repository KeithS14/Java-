/**
 * LoanAccount is the class used to initialise the Loan Account
 *
 * @author Keith Patrick Scannell
 *
 */

public class LoanAccount extends BankAccount{

    /**
     * The overdraft limit
    * */
    private  int overDraftLimit;

    @Override
    public String toString(){
        return super.toString() + ", "+ getOverDraftLimit();
    }

    //constructor
    /**
     *  Initialises the person, account number, balance and overdraft
     *
     * @param newPerson - the person who owns the bank account
     * @param newAccNum - the account number of the bank account
     * @param newBalance - the balance of the bank account
     * @param newOverDraft - the overdraft of the loan
     * */
    public LoanAccount(Person newPerson, int newAccNum, int newBalance,int newOverDraft ){
        super(newPerson,newAccNum,newBalance);
        setOverDraftLimit(newOverDraft);
    }

    // methods
    /**
     * Displays the person's details as well as the bank/loan account details
     * */
    public void display(){
        super.display();
        System.out.println("Overdraft: "+ getOverDraftLimit());

    }
    // Getters and Setters
    public int getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(int overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }



}
