package outside;

import banking_system.Bank;


public class Tester {

    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer Account_0001 = new Customer(bank);
        Customer Account_0002 = new Customer(bank);


        Account_0001.openAccount();
        System.out.println("The account number of 0001 is : " + Account_0001.getCurrentAcc());
        Account_0001.withdrawMoney(50);
        System.out.println("0001's balance is " + Account_0001.checkBalance());
        Account_0001.depositMoney(1000);
        System.out.println("Checking balance of 0001 after deposit :" +Account_0001.checkBalance());
        Account_0001.withdrawMoney(700);
        System.out.println("Checking balance of 0001 after withdraw :" +Account_0001.checkBalance());


        Account_0002.openAccount();
        System.out.println("The account number of 0002 is : " + Account_0002.getCurrentAcc());
        Account_0002.depositMoney(228);
        System.out.println("Checking balance of 0002 after deposit :" +Account_0002.checkBalance());
        Account_0002.withdrawMoney(300);
        System.out.println("Checking balance of 0002 after withdraw :" +Account_0002.checkBalance());
        Account_0002.withdrawMoney(210);
        System.out.println("Checking balance of 0002 after correc withdrawal :" +Account_0002.checkBalance());

        
    }
}
