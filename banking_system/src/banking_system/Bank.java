package banking_system;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private ATM ATM;


    public Bank(){
        accounts = new ArrayList<>();
        this.ATM = new ATM(this);
    }

    public int createAccount(){
        Account ac = new Account((accounts.size()+100),0);
        accounts.add(accounts.size(), ac);
        System.out.println("Printing account number in Bank" + ac.getAccountNumber());
        return ac.getAccountNumber();
    }

    public ATM getATM(){
        return ATM;
    }

    protected int accessAccInfo(int acctNum) throws Exception {
        if((acctNum> accounts.size()+99) && (acctNum<100)){
            throw new Exception("No such account exists");
        }
        return accounts.get(acctNum-100).getAccountBalance();
    }

    protected void updateAcctBal(int acctNum, int diff) throws Exception{
        if((acctNum> accounts.size()+99) && (acctNum<100)){
            System.out.println("Account wasn't founded in bank");
            throw new Exception("No such account exists");
        }
        if(accounts.get(acctNum - 100).getAccountBalance() + diff <0){
            System.out.println("Negative balance");
            throw new Exception("The resulting balance would be negative");
        }
        accounts.get(acctNum - 100).addAccountBalance(diff);
    }


    protected ArrayList<Account> getAccounts() {
        return accounts;
    }
}
