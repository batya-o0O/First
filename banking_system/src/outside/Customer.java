package outside;

import banking_system.ATM;
import banking_system.Bank;

public class Customer {
    private Bank bank;
    private int currentAcc;

    public Customer(Bank b){
        bank = b;
        currentAcc = -1;
    }

    public void openAccount(){
        currentAcc = bank.createAccount();
    }

    public void depositMoney(int amount){
        ATM atm = bank.getATM();
        atm.loginToAccount(currentAcc);
        atm.deposit(amount);
        atm.logout();
    }

    public void withdrawMoney(int amount){
        ATM atm = bank.getATM();
        atm.loginToAccount(currentAcc);
        atm.withdraw(amount);
        atm.logout();
    }

    public int checkBalance(){
        ATM atm = bank.getATM();
        atm.loginToAccount(currentAcc);
        int currentBalance = atm.getBalance();
        atm.logout();
        return currentBalance;
    }

    public int getCurrentAcc(){
        return currentAcc;
    }
}
