package banking_system;

public class Account {

    private int accountNumber;
    private int accountBalance;

    protected Account(int number,int balance){
         accountNumber = number;
         accountBalance = balance;
    }

    protected int getAccountBalance() {
        return accountBalance;
    }

    protected int getAccountNumber() {
        return accountNumber;
    }

    protected void addAccountBalance(int balance){
        accountBalance += balance;
    }

}
