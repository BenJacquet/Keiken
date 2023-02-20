package com.codurance.srp;

import java.time.LocalDate;

public class Transaction {
    private LocalDate date;
    private int amount;

    Transaction(LocalDate date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate date() {
        return date;
    }

    public int amount() {
        return amount;
    }

    public void deposit(int amount) {
        transactionRepository.add(transactionWith(amount));
    }


    public void withdraw(int amount) {
        transactionRepository.add(transactionWith(-amount));
    }


    private Transaction transactionWith(int amount) {
        return new Transaction(clock.today(), amount);
    }
}
