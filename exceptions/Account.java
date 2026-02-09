package exceptions;

public class Account {
    int accountNumber;
    double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void withdraw(int amount){
        if(amount<0){
            throw  new IllegalArgumentException("Withdrawal amount must be greater than zero");
        }else if(balance<amount){
            throw  new InSufficientBalanceException("Insufficient balance. Available: " + balance + ", Requested: " + amount);
        }else{
            balance-=amount;
        }
    }
    public void showDetails(){
        System.out.println("Account Number is "+accountNumber);
        System.out.println("Balance is "+balance);
    }
}
