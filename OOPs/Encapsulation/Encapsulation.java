 package OOPs.Encapsulation;
class BankAccount{
    private final  String accountNumber;
    private int balance;

    public BankAccount(String accountNumber,int balance) {
        this.accountNumber=accountNumber;
        this.balance=balance;

    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposite: "+amount);
        }
        else System.out.println("Invalid Amount");
    }
    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw :"+amount);
        }
        else System.out.println("Invalid Amount");
    }

}

public class Encapsulation {
public static void main(String[] args) {
   BankAccount account=new BankAccount("785236", 1000);
   account.deposit(510);
   System.out.println("Remaining Balance :"+ account.getBalance());
   account.withdraw(500);
   System.out.println("Remaining Balance :"+ account.getBalance());

    
  }
    
}