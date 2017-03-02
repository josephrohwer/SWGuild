/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankmanager;

/**
 *
 * @author josephrohwer
 */
public class BankController {

    ConsoleIO console = new ConsoleIO();
    private int pin;
    private int pin2;
    private int account;
    Checkings ch = new Checkings(0);
    Savings sa = new Savings(0);

    public void creation() {
        pin = console.readInteger("Create a pin. This will be used to access\n"
                + "your accounts: ", 1, 9999);
        console.write("\nWelcome to Cherokee State Bank!\n");
        do {
            pin2 = console.readInteger("What is your pin number?: ", 1, 9999);
            if (pin == pin2) {
                run();
            } else {
                console.write("\nWRONG PIN! PLEASE TRY AGAIN.\n");
            }
        } while (pin != pin2);
        run();
    }

    public void run() {
        account = console.readInteger("\nWhich account would you like to withdraw or deposit from?\n"
                + "    1.) Checkings\n"
                + "    2.) Savings\n"
                + "    3.) EXIT\n"
                + "> ", 1, 3);
        switch (account) {
            case 1:
                checkings();
                break;
            case 2:
                savings();
                break;
            case 3:
                console.write("\nThank you for doing business with us.");
                System.exit(0);
            default:
                break;
        }
    }

    public void checkings() {
        int depositAmount = console.readInteger("\nHow much would you like to deposit?: ");
        ch.deposit(depositAmount);

        int withdrawAmount = console.readInteger("How much would you like to withdraw?: ");
        ch.withdraw(withdrawAmount);

        System.out.println("Your balance is: $" + ch.getBalance());
        System.out.println("Your overdraft fees are: $" + ch.getOverdraftFees());
        run();
    }

    public void savings() {
        int depositAmount = console.readInteger("\nHow much would you like to deposit?: ");
        sa.deposit(depositAmount);

        int withdrawAmount = console.readInteger("How much would you like to withdraw?: ");
        sa.withdraw(withdrawAmount);

        System.out.println("Your balance is: $" + sa.getBalance());
        System.out.println("Your overdraft fees are: $" + sa.getOverdraftFees());
        run();
    }
}
