package exceptions;

import java.util.Scanner;

public class BankAccountService {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        try {
            Account account = new Account(101, 10000.0);
            System.out.print("Enter amount want to withdraw from account :");
            int amount = sc.nextInt();
            account.withdraw(amount);
            account.showDetails();
            sc.close();

        } catch (IllegalArgumentException | InSufficientBalanceException il) {
            System.out.println("Error "+il.getMessage());
        }

    }
}
