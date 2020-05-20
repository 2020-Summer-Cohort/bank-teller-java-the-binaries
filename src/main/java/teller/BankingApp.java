package teller;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {

        Account myAccount = new Account("100", "Checking", 500.12);

        System.out.println("Welcome to the Bank Teller! What would you like to do?");
        System.out.println("Press 1: Make a deposit.");
        System.out.println("Press 2: Make a withdrawal.");
        System.out.println("Press 3: Check account balance.");
        System.out.println("Press 4: Close account.");
        System.out.println("Press 0: Exit.");

        Scanner scanner = new Scanner(System.in);
        int userSelection = scanner.nextInt();

        while (true) {

//            System.out.println("What would you like to do?");
//            System.out.println("Press 1: Make a deposit.");
//            System.out.println("Press 2: Make a withdrawal.");
//            System.out.println("Press 3: Check account balance.");
//            System.out.println("Press 4: Close account.");
//            System.out.println("Press 0: Exit.");

            if (userSelection == 1) {
                myAccount.addFunds();
            }
//                continue;
//            } else if (userSelection == 2) {
//                myAccount.subtractFunds();
//                continue;
//            } else if (userSelection == 3) {
//                myAccount.currentFunds();
//                continue;
//            } else if (userSelection == 0) {
//                System.out.println("Goodbye!");
//                break;
//
//            } else {
//                break;

            }
        }

    }
