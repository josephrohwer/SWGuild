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
public class Savings extends Account {

    private int depositAmount;
    private int withdrawAmount;
    private int overdraftFees = 0;
    private int overdraftProtection = -100;

    public Savings(int balance) {
        super(balance);
    }

    @Override
    public void deposit(int depositAmount) {
        if (depositAmount <= 10000) {
            super.deposit(depositAmount);
        } else {
            System.out.println("BANK MANAGER HAS BEEN CONTACTED TO CLEAR DEPOSIT. PLEASE WAIT.\n");
        }
    }

    @Override
    public void withdraw(int withdrawAmount) {

        if (getBalance() >= withdrawAmount) {
            super.withdraw(withdrawAmount);
        } else if (((getBalance() - withdrawAmount) >= overdraftProtection) && (getBalance() - withdrawAmount < 0)) {
            overdraftFees += 10;
            super.withdraw(withdrawAmount);
        } else {
            System.out.println("INSUFFICIENT FUNDS. MONEY NOT WITHDRAWN.\n");
        }
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public int getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public int getOverdraftFees() {
        return overdraftFees;
    }
}
