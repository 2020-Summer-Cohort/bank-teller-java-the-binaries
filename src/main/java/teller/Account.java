package teller;

import java.util.Scanner;

public class Account {

//    declare instance variables
    private String accountNumber;
    private String accountType;
    private double accountBalance;

//    create a constructor
    public Account(String accountNumber, String accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

//    create getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

// create deposit method

    Scanner scanner = new Scanner(System.in);

    public void addFunds() {
        System.out.println("You want to make a deposit. Please type deposit amount.");
        double depositAmount = scanner.nextDouble();
        System.out.println("Deposit amount is $" + depositAmount + ".");
        System.out.println("Your current balance is $" + (getAccountBalance() + depositAmount));
    }

    public void subtractFunds() {
        System.out.println("You want to make a withdrawal. Please type withdrawal amount.");
        double withdrawalAmount = scanner.nextDouble();
        System.out.println("The withdrawal amount is $" + withdrawalAmount + ".");
        System.out.println("Your current balance is $" + (getAccountBalance() - withdrawalAmount));
    }

    public void currentFunds() {

        System.out.println("Your current balance is $" + getAccountBalance() + ".");
    }
}
