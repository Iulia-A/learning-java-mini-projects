package com.miniapps.bankapp;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        Scanner scanner = new Scanner(System.in);

        Integer choice = null;
        double amount;
        while (choice == null) {
            try {
                System.out.println("What do you want to do? For withdrawals enter 1, for deposits enter 2, and for exit press 3: ");
                choice = Integer.parseInt(scanner.next());
                switch (choice) {
                    case 3:
                        break;
                    case 1:
                        System.out.println("Please enter the amount: ");
                        amount = scanner.nextDouble();
                        bankAccount.withdraw(amount);
                        break;
                    case 2:
                        System.out.println("Please enter the amount: ");
                        amount = scanner.nextDouble();
                        bankAccount.deposit(amount);
                        break;
                    default:
                        System.out.println("This option doesn`t exist!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }
    }
}
