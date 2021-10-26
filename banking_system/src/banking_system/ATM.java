package banking_system;

public class ATM {

    private Bank bank;
    private int currentAcc;

    protected ATM(Bank b){
        bank = b;
        currentAcc = -1;
    }

    public boolean loginToAccount(int acctNum){
        if((acctNum> bank.getAccounts().size()+100) && (acctNum<100)){
            return false;
        }
        currentAcc = acctNum;
        return true;
    }

    public boolean deposit(int amount){
        if(currentAcc==-1){
            System.out.println("Not logged");
            return false;
        }
        try{
            bank.updateAcctBal(currentAcc, amount);
            System.out.println("Balance is updated");
            return true;
        } catch (Exception Exception){
            System.out.println("Exception was catched");
            return false;
        }
    }

    public boolean withdraw (int amount){
        if(currentAcc==-1){
            return false;
        }
        try{
            bank.updateAcctBal(currentAcc, -amount);
            return true;
        } catch (Exception Exception){
            return false;
        }
    }

    public int getBalance(){
        if(currentAcc==-1){
            return 0;
        }
        try{
            return bank.accessAccInfo(currentAcc);
        } catch (Exception Exception){
            System.out.println("Exception was caught at getBalance");
            return 0;
        }
    }

    public void logout(){
        currentAcc =-1;
    }
}
